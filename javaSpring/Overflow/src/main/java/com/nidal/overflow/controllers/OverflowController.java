package com.nidal.overflow.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nidal.overflow.models.Answer;
import com.nidal.overflow.models.Question;
import com.nidal.overflow.models.Tag;
import com.nidal.overflow.services.AnswerService;
import com.nidal.overflow.services.QuestionService;
import com.nidal.overflow.services.TagService;

@Controller
public class OverflowController {
	private final QuestionService questionService;
	private final TagService tagService;
	private final AnswerService answerService;
	
	public OverflowController(QuestionService questionService, TagService tagService, AnswerService answerService) {
		this.questionService = questionService;
		this.tagService = tagService;
		this.answerService = answerService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Question> questions = questionService.findAll();
		model.addAttribute("questions", questions);
		return "dashboard.jsp";
	}
	@RequestMapping("/questions/new")
	public String newQuestion(@ModelAttribute("addQuestion")Question question) {
		return "newquestion.jsp";
	}
	@RequestMapping(value="/questions/new", method=RequestMethod.POST)
	public String createQuestion(@Valid @ModelAttribute("addQuestion")Question question, BindingResult result, @RequestParam("tag") String tag,RedirectAttributes flash) {
		int numComma = tag.replaceAll("[^,]", "").length();
		if (numComma>2) {
			flash.addFlashAttribute("errors", "Maximum of three tags are allowed");
		}
		if (!tag.equals(tag.toLowerCase())) {
			flash.addFlashAttribute("errors", "tags must be lowercased");
		}
		if((result.hasErrors()) || (flash.getFlashAttributes().size()>0)){	
			return "redirect:/questions/new";
		}else {
			Question myQuestion = questionService.createQuestion(question);
			List<String> items = (List<String>)Arrays.asList(tag.trim().split("\\s*,\\s*"));
			System.out.println(items);
			ArrayList<Tag> tags = new ArrayList<Tag>();
			for(int i=0;i<items.size();i++) {
				tags.add(tagService.createTag(items.get(i)));
				System.out.println("show : "+items.get(i));
			}
			questionService.createQuestion(myQuestion);
			return "redirect:/questions/new";
		}		
	}
	@RequestMapping("/questions/{id}")
	public String show(@ModelAttribute("answer")Answer answer, @PathVariable("id")Long id, Model model) {
		Question myQuestion = questionService.findQuestion(id);
		model.addAttribute("myquestion", myQuestion);
		model.addAttribute("myTags", myQuestion.getTags());
		model.addAttribute("answers", myQuestion.getAnswers());
		return "showquestion.jsp";
	}
	
	@RequestMapping(value="/add-answer", method=RequestMethod.POST)
	public String addAnswer(@Valid @ModelAttribute("answer")Answer answer, BindingResult result){
		System.out.println(answer.getId());
		answerService.createAnswer(answer);
		Long myID = answer.getQuestion().getId();
		return "redirect:/questions/"+myID;
	}
}

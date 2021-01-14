package com.nidal.overflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nidal.overflow.models.Question;
import com.nidal.overflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	private final QuestionRepository questionRepository;
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	public Question createQuestion(Question question) {
		return questionRepository.save(question);
	}
	public Question findQuestion(Long id) {
		Optional<Question> question = questionRepository.findById(id);
		if (question.isPresent()) {
			return question.get();
		}else {
			return null;
		}
	}
	public List<Question> findAll(){
		return questionRepository.findAll();
	}
}
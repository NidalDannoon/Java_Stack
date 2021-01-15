package com.nidal.app.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nidal.app.components.UserValidator;
import com.nidal.app.models.User;
import com.nidal.app.services.UserService;

@Controller
public class UserController {
    private final UserService userService;
    private final UserValidator userValidator;

    public UserController (UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }

    @RequestMapping("/")
    public String user (@ModelAttribute("user") User user) {
        return "user.jsp";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        userValidator.validate(user, result);

        if (result.hasErrors()) {
            return "user.jsp";
        }
        else {
            userService.registerUser(user);
            session.setAttribute("id", user.getId());
            return "redirect:/home";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, RedirectAttributes redirect) {
        boolean success = userService.authenticateUser(email, password);

        if (email.length() < 1) {
        	redirect.addFlashAttribute("error", "Email field is empty");
            return "redirect:/";
        }
        else if (password.length() < 1) {
        	redirect.addFlashAttribute("error", "Password field is empty");
            return "redirect:/";
        }
        else if (!success) {
        	redirect.addFlashAttribute("error", "Email and password do not match");
            return "redirect:/";
        }
        else {
            User user = userService.findByEmail(email);
            Long id = user.getId();
            session.setAttribute("id", id);
            return "redirect:/home";
        }
    }

    @RequestMapping("/home")
    public String home (HttpSession session, Model model) {
    	if (session.getAttribute("id") ==null) {
    		return "redirect:/";
    	}
    	else {
        Long id = (Long) session.getAttribute("id");
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "index.jsp";
    }
    }

    @RequestMapping("/logout")
    public String logout (HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
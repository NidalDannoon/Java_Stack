package com.nidal.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
        Integer counter = (Integer)session.getAttribute("counter");
		counter+= 1;
		session.setAttribute("counter", counter);
		return "index.jsp";
	}
}

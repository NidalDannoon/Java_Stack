package com.nidal.ninjagold;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProcessingController {
	@RequestMapping(value="/processing", method=RequestMethod.POST)
	public String processing(@RequestParam(value="building") String building, HttpSession session) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());	
		if(building.equals("farm")) {
			int rand = ThreadLocalRandom.current().nextInt(10, 20 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+rand);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add(0, "You entered a farm and earned "+rand+" gold.("+timeStamp+")");
		}
		if(building.equals("cave")) {
			int rand = ThreadLocalRandom.current().nextInt(5, 10 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+rand);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add(0, "You entered a cave and earned "+rand+" gold.("+timeStamp+")");
		}
		if(building.equals("house")) {
			int rand = ThreadLocalRandom.current().nextInt(2, 5 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+rand);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add(0, "You entered a house and earned "+rand+" gold.("+timeStamp+")");
		}
		if(building.equals("casino")) {
			int rand = ThreadLocalRandom.current().nextInt(-50, 50 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+rand);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			if(rand < 0) {
				activities.add(0, "You entered a casino and lost "+rand+" gold.("+timeStamp+")");
			}
			else {
				activities.add(0,"You entered a casino and earned "+rand+" gold.("+timeStamp+")");
			}
		}
		return "redirect:/";
	}
}

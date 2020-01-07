package org.cap.controller;

import org.cap.entities.AppUser;
import org.cap.entities.Employee;
import org.cap.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	private IUserService service;

	public IUserService getService() {
		return service;
	}

	@Autowired
	public void setService(IUserService service) {
		this.service = service;
	}

	@GetMapping("/userinput")
	public ModelAndView userinput() {

		return new ModelAndView("/userinput");

	}

	@GetMapping("/userdetails")
	public ModelAndView userdetails(@RequestParam("id") int id,
			@RequestParam("password") String password) {
		if (service.credentialsCorrect(id, password)) {
			AppUser user=service.getUserById(id);
			ModelAndView mv = new ModelAndView("userdetails", "user", user);
			return mv;
		} else
			return new ModelAndView("userinput");

	}
}

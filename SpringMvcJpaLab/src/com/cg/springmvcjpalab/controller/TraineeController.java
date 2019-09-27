package com.cg.springmvcjpalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcjpalab.dto.Trainee;
import com.cg.springmvcjpalab.service.TraineeService;

@Controller
public class TraineeController {

	@Autowired
	TraineeService traineeService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/adminHome", method = RequestMethod.POST)
	public String adminHome(@RequestParam("adminUsername") String username,
			@RequestParam("adminPassword") String password) {
		if (username.equals("root") && password.equals("1234")) {
			return "adminHome";
		} else {
			return "invalidLogin";
		}
	}

	@RequestMapping(value = "/addTrainee", method = RequestMethod.GET)
	public String addTraineePage(@ModelAttribute("trainee") Trainee trainee) {
		return "addTrainee";
	}

	@RequestMapping(value = "/traineeAdd", method = RequestMethod.POST)
	public String traineeAdd(@ModelAttribute("trainee") Trainee trainee) {
		traineeService.add(trainee);
		return "adminHome";
	}

	@RequestMapping(value = "/deleteTrainee", method = RequestMethod.GET)
	public String deleteTraineePage() {
		return "deleteTrainee";
	}

	@RequestMapping(value = "/traineeViewDelete", method = RequestMethod.GET)
	public ModelAndView deleteShowTrainee(@RequestParam("deleteId") Integer traineeId) {
		return new ModelAndView("deleteTrainee","trainee", traineeService.view(traineeId));
	}

	@RequestMapping(value = "/traineeDelete", method = RequestMethod.POST)
	public String traineeDelete(@RequestParam("deleteId") Integer traineeId) {
		traineeService.remove(traineeId);
		return "adminHome";
	}

	@RequestMapping(value = "/retrieveTrainee", method = RequestMethod.GET)
	public String retrieveTraineePage() {
		return "retrieveTrainee";
	}

	@RequestMapping(value = "traineeRetrieve", method = RequestMethod.POST)
	public ModelAndView traineeRetrieve(@RequestParam("retrieveId") Integer traineeId) {
		return new ModelAndView("retrieveTrainee", "trainee", traineeService.view(traineeId));
	}

	@RequestMapping(value = "/retrieveAll", method = RequestMethod.GET)
	public ModelAndView retrieveAllTrainee() {
		return new ModelAndView("retrieveAll", "traineeData", traineeService.viewAll());
	}

}

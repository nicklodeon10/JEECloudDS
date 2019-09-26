package com.cg.springmvcpractice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcpractice.dto.Employee;
import com.cg.springmvcpractice.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String backHome() {
		return "Home";
	}
	
	@RequestMapping(value="/addEmployee", method = RequestMethod.GET)
	public String addEmployee(@ModelAttribute("employee")Employee employee) {
		return "addEmployee";
	}
	
	@RequestMapping(value="/submitEmployee", method= RequestMethod.POST)
	public String submitEmployee(@ModelAttribute("employee")Employee employee) {
		employeeService.addEmployee(employee);
		return "submitted";
	}
	
	@RequestMapping(value="/showEmployee", method=RequestMethod.GET)
	public ModelAndView showEmployee() {
		return new ModelAndView("viewEmployee","employeeData",employeeService.showEmployee());
	}
	
	@RequestMapping(value="/searchEmployee", method=RequestMethod.GET)
	public ModelAndView findEmployee(@RequestParam("searchId")Integer empId) {
		List<Employee> empList=new ArrayList<>();
		empList.add(employeeService.findEmployee(empId));
		return new ModelAndView("SearchEmployee","employeeData", empList);
	}
}

package com.javi.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// add an initBinder ... to convert trim input strings. Pre-process every String form data
	// remove leading and trailing whitespace
	// resolve issue for our validation. If String only has white space... trim it to null
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);//Defined in String API. true -> means trim to null.
		//StringTrimmerEditor: removes whitespace - leading and trailing
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());//name, value
		
		return "customer-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid //Perform validation rules on Customer object
			@ModelAttribute("customer") Customer theCustomer, //Tell Spring to validate the Customer object
			BindingResult theBindingResult//Results of validation placed in the BindingResult
			//Spring will store results of validation in BindingResult object
			) {
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		
		else {
			return "customer-confirmation";
		}
		
	}
	

}

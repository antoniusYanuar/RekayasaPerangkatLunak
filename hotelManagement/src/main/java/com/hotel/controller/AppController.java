package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hotel.model.Customer;
import com.hotel.service.CustomerService;

@Controller
public class AppController {
	@Autowired
	private CustomerService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Customer> listCustomer = service.listAll();
		model.addAttribute("listCustomer", listCustomer);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String addNewCustomerPage(Model model) {
	    Customer customer = new Customer();
	    model.addAttribute("customer", customer);
	     
	    return "new_customer";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("customer") Customer customer) {
	    service.saveCustomer(customer);
	     
	    return "redirect:/";
	}
}

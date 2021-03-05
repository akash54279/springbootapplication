package com.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Customer;
import com.springboot.service.CustomerService;


@RestController
public class HomeController {
	@Autowired
	private CustomerService customerservice;
	
	@PostMapping("/save")
	public Customer savedata(@RequestBody Customer c) {
	 return customerservice.savedata(c);	
	}
	
	@GetMapping("/get/{id}")
    public Optional<Customer> getdata(@PathVariable Integer id){
    	return customerservice.getdata(id);
    }
	@DeleteMapping("/delete/{id}")
	public String deletedata(@PathVariable Integer id) {
		return customerservice.deletedata(id);
	}
	@PutMapping("/update")
	public Customer updatedata(@RequestBody Customer c) {
		return customerservice.updatedata(c);
	}
	
	
}

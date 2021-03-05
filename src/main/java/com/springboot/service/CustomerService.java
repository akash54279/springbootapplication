package com.springboot.service;

import java.util.Optional;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.CustomerDao;
import com.springboot.entity.Customer;

@Service
public class CustomerService {
    @Autowired
	private CustomerDao customerdao;

	public Customer savedata(Customer c) {
		
		return customerdao.save(c);
	}

	public Optional<Customer> getdata(Integer id) {
		
		return customerdao.findById(id);
	}

	public String deletedata(Integer id) {
		
		customerdao.deleteById(id);;
		return "data is deleted";
	}

	public Customer updatedata(Customer c) {
		
		return customerdao.saveAndFlush(c);
	}
    
    
    
    
}

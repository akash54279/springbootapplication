package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Customer;
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}

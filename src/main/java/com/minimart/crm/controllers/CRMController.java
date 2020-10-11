package com.minimart.crm.controllers;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.minimart.crm.model.Customer;
import com.minimart.crm.dal.CustomerRepository;

@RestController
public class CRMController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final CustomerRepository customerRepository;

	public CRMController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@RequestMapping("/")
	public String index() {
		LOG.info("Greetings !!.");
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> getAllUsers() {

		List<Customer> allCustomers = customerRepository.findAll();
		LOG.info("Customer Count : "+allCustomers.size());
		return allCustomers;
	}

}
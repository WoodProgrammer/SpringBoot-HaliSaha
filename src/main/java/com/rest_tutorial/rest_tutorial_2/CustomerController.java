package com.rest_tutorial.rest_tutorial_2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import javax.validation.Valid;

import java.util.List;



@RestController
@RequestMapping("/customers")
public class CustomerController {


    @Autowired
    CustomerRepository customerRepository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Customer> getAllCustomers(){

        return customerRepository.findAll();

    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Customer createPet(@Valid @RequestBody Customer customers) {
        customerRepository.save(customers);
        return customers;
    }



}

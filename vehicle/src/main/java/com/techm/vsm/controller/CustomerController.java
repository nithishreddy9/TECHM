package com.techm.vsm.controller;

import com.techm.vsm.entity.Customer;
import com.techm.vsm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> getAll() {
        return service.getAllCustomers();
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }
}

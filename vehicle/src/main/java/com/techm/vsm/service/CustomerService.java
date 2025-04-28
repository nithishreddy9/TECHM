package com.techm.vsm.service;

import com.techm.vsm.entity.Customer;
import com.techm.vsm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }
}

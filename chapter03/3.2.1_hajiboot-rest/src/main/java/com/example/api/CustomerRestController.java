package com.example.api;

import com.example.domain.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // (1)
@RequestMapping("api/customers") // (2)
public class CustomerRestController {
    @Autowired // (3)
    CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET) // (4)
    List<Customer> getCustomers() {
        List<Customer> customers = customerService.findAll();
        return customers; // (5)
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET) // (6)
    Customer getCustomer(@PathVariable Integer id) { // (6)
        Customer customer = customerService.findOne(id);
        return customer;
    }
}

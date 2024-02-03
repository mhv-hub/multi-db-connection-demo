package com.mhv.dbtest.controller;

import com.mhv.dbtest.entity.primary.Account;
import com.mhv.dbtest.entity.secondary.Customer;
import com.mhv.dbtest.repository.primary.AccountRepository;
import com.mhv.dbtest.repository.secondary.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/create/account")
    public Account createAccount(){
        return accountRepository.save(new Account("ACC_1", new Date()));
    }

    @GetMapping("/create/customer")
    public Customer createCustomer(){
        return customerRepository.save(new Customer("CUS_1", "Akash"));
    }

    @GetMapping("get/account")
    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    @GetMapping("get/customer")
    public List<Customer> getCustomer(){
        return customerRepository.findAll();
    }
}

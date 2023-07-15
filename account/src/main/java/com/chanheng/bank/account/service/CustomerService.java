package com.chanheng.bank.account.service;

import com.chanheng.bank.account.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    List<Customer> getCustomers();
    Customer getCustomerById(Long id);
}

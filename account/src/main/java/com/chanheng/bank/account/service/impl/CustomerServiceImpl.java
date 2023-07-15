package com.chanheng.bank.account.service.impl;

import com.chanheng.bank.account.entity.Customer;
import com.chanheng.bank.account.repository.CustomerRepository;
import com.chanheng.bank.account.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Customer not found"));
    }
}

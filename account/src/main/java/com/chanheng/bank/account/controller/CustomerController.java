package com.chanheng.bank.account.controller;

import com.chanheng.bank.account.dto.CustomerDTO;
import com.chanheng.bank.account.entity.Customer;
import com.chanheng.bank.account.mapper.CustomerMapper;
import com.chanheng.bank.account.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO dto){
        Customer customer = customerMapper.toCustomer(dto);
        customer = customerService.save(customer);
        return ResponseEntity.ok(customer);
    }

    @GetMapping
    public ResponseEntity<?> getCustomers(){
        return ResponseEntity.ok(customerService.getCustomers());
    }
    @GetMapping("{customerId}")
    public ResponseEntity<?> getCustomers(@PathVariable Long customerId){
        return ResponseEntity.ok(customerService.getCustomerById(customerId));
    }
}

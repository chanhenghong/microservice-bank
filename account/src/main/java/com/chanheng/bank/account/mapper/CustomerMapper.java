package com.chanheng.bank.account.mapper;

import com.chanheng.bank.account.dto.CustomerDTO;
import com.chanheng.bank.account.entity.Customer;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CustomerMapper {
    public Customer toCustomer(CustomerDTO dto){
        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setMobileNumber(dto.getMobileNumber());
        customer.setCreateTime(LocalDate.parse(dto.getCreateDate()));
        return customer;
    }
}

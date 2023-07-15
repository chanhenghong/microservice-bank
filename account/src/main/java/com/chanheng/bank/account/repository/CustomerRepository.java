package com.chanheng.bank.account.repository;

import com.chanheng.bank.account.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

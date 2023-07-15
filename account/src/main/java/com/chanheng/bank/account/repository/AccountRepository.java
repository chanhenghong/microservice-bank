package com.chanheng.bank.account.repository;

import com.chanheng.bank.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long>, JpaRepository<Account, Long> {
}

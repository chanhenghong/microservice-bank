package com.chanheng.bank.account.service.impl;

import com.chanheng.bank.account.entity.Account;
import com.chanheng.bank.account.repository.AccountRepository;
import com.chanheng.bank.account.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElseThrow(()->new RuntimeException("Account Not Found"));
    }
}

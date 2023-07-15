package com.chanheng.bank.account.service;

import com.chanheng.bank.account.entity.Account;

import java.util.List;

public interface AccountService {
    Account saveAccount(Account account);
    List<Account> getAccounts();
    Account getAccountById(Long id);
}

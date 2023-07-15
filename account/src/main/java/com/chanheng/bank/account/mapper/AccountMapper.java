package com.chanheng.bank.account.mapper;

import com.chanheng.bank.account.dto.AccountDTO;
import com.chanheng.bank.account.entity.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public Account toAccount(AccountDTO dto){
        Account account = new Account();
        account.setCustomerId(dto.getCustomerId());
        account.setAccountType(dto.getAccountType());
        account.setBranchAddress(dto.getBranchAddress());
        return account;
    }
}

package com.chanheng.bank.account.controller;

import com.chanheng.bank.account.dto.AccountDTO;
import com.chanheng.bank.account.entity.Account;
import com.chanheng.bank.account.mapper.AccountMapper;
import com.chanheng.bank.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private AccountService accountService;
    @PostMapping
    public ResponseEntity<?> saveAccount(@RequestBody AccountDTO dto){
        Account account = accountMapper.toAccount(dto);
        account.setCreateDate(LocalDate.now());
        account = accountService.saveAccount(account);
        return ResponseEntity.ok(account);
    }
    @GetMapping
    public ResponseEntity<?> getAccounts(){
        return ResponseEntity.ok(accountService.getAccounts());
    }
    @GetMapping("{accountId}")
    public ResponseEntity<?> getAccountById(@PathVariable Long accountId){
        Account account = accountService.getAccountById(accountId);
        return ResponseEntity.ok(account);
    }
}

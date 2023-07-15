package com.chanheng.bank.loan.controller;

import com.chanheng.bank.loan.dto.LoanDTO;
import com.chanheng.bank.loan.entity.Loan;
import com.chanheng.bank.loan.mapper.LoanMapper;
import com.chanheng.bank.loan.service.LoanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("api/loans")
@Slf4j
public class LoanController {
    @Autowired
    private LoanMapper loanMapper;
    @Autowired
    private LoanService loanService;
    @PostMapping
    public ResponseEntity<?> saveLoan(@RequestBody LoanDTO dto){
        Loan loan = loanMapper.toLoan(dto);
        log.info("LoanDTO::: ={}", dto);
        loan.setCreateDate(LocalDate.now());
        Loan loan1 = loanService.saveLoan(loan);
        return ResponseEntity.ok(loan1);
    }
    @GetMapping
    public ResponseEntity<?> getLoans(){
        return ResponseEntity.ok(loanService.getLoans());
    }
    @GetMapping("{CustomerId}")
    public ResponseEntity<?> getLoanById(@PathVariable Long CustomerId){
        return ResponseEntity.ok(loanService.getLoanByCustomerId(CustomerId));
    }
}

package com.chanheng.bank.loan.service;

import com.chanheng.bank.loan.dto.LoanDTO;
import com.chanheng.bank.loan.entity.Loan;

import java.util.List;

public interface LoanService {
    Loan saveLoan(Loan loan);
    List<Loan> getLoans();
    List<Loan> getLoanByCustomerId(Long id);
}

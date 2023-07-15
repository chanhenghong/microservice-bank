package com.chanheng.bank.loan.service.impl;

import com.chanheng.bank.loan.entity.Loan;
import com.chanheng.bank.loan.repository.LoanRepository;
import com.chanheng.bank.loan.service.LoanService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LoanServiceImpl implements LoanService {
    @Autowired
    private LoanRepository loanRepository;
    @Override
    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public List<Loan> getLoans() {
        return loanRepository.findAll();
    }

    @Override
    public List<Loan> getLoanByCustomerId(Long id) {
        return loanRepository.findLoanByCustomerId(id);
    }
}

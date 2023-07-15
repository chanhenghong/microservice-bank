package com.chanheng.bank.loan.mapper;

import com.chanheng.bank.loan.dto.LoanDTO;
import com.chanheng.bank.loan.entity.Loan;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class LoanMapper {
    public Loan toLoan(LoanDTO dto){
        Loan loan = new Loan();
        loan.setCustomerId(dto.getCustomerId());
        loan.setLoanNumber(dto.getLoanNumber());
        loan.setStartDt(dto.getStartDt());
        loan.setLoanType(dto.getLoanType());
        loan.setTotalLoan(dto.getTotalLoan());
        loan.setAmountPaid(dto.getAmountPaid());
        loan.setOutstandingAmount(dto.getOutstandingAmount());
        return loan;
    }
}

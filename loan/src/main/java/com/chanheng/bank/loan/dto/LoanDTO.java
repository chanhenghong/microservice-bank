package com.chanheng.bank.loan.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LoanDTO {
    private Long loanNumber;
    private Long customerId;
    private String startDt;
    private String loanType;
    private Long totalLoan;
    private Long amountPaid;
    private Long outstandingAmount;
}

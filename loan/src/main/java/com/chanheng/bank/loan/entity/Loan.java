package com.chanheng.bank.loan.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "loans")
@Data
public class Loan {
    private Long loanNumber;
    private Long customerId;
    private String startDt;
    private String loanType;
    private Long totalLoan;
    private Long amountPaid;
    private Long outstandingAmount;
    private LocalDate createDate;
}

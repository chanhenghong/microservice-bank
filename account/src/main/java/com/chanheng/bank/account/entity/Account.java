package com.chanheng.bank.account.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;
    @ManyToOne
    @JoinColumn(name = "customer_id")
//    @ToString.Exclude
    private Customer customerId;
    private String accountType;
    private String branchAddress;
    private LocalDate createDate;
}

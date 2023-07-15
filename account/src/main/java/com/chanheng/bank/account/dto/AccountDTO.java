package com.chanheng.bank.account.dto;

import com.chanheng.bank.account.entity.Customer;
import lombok.Data;


@Data
public class AccountDTO {
    private Customer customerId;
    private String accountType;
    private String branchAddress;
}

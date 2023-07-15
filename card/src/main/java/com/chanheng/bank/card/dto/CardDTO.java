package com.chanheng.bank.card.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CardDTO {
    private Long cardId;
    private Long customerId;
    private Long cardNumber;
    private String cardType;
    private Long totalLimit;
    private Long amountUsed;
    private Long availableAmount;
}

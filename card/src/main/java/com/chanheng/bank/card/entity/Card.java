package com.chanheng.bank.card.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "cards")
@Data
public class Card {
    private Long cardId;
    private Long customerId;
    private Long cardNumber;
    private String cardType;
    private Long totalLimit;
    private Long amountUsed;
    private Long availableAmount;
    private LocalDate createDate;
}

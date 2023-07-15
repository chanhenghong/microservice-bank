package com.chanheng.bank.card.service;

import com.chanheng.bank.card.entity.Card;

import java.util.List;

public interface CardService {
    Card saveCard(Card card);
    List<Card> getCards();
    Card getCardById(Long id);
}

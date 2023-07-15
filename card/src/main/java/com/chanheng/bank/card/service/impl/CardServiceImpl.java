package com.chanheng.bank.card.service.impl;

import com.chanheng.bank.card.entity.Card;
import com.chanheng.bank.card.repository.CardRepository;
import com.chanheng.bank.card.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;
    @Override
    public Card saveCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public List<Card> getCards() {
        return cardRepository.findAll();
    }

    @Override
    public Card getCardById(Long id) {
        return cardRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Card not found!"));
    }
}

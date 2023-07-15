package com.chanheng.bank.card.mapper;

import com.chanheng.bank.card.dto.CardDTO;
import com.chanheng.bank.card.entity.Card;
import org.springframework.stereotype.Component;

@Component
public class CardMapper {
    public Card toCard(CardDTO dto){
        Card card = new Card();
        card.setCardId(dto.getCardId());
        card.setCustomerId(dto.getCustomerId());
        card.setCardNumber(dto.getCardNumber());
        card.setCardType(dto.getCardType());
        card.setTotalLimit(dto.getTotalLimit());
        card.setAmountUsed(dto.getAmountUsed());
        card.setAvailableAmount(dto.getAvailableAmount());
        return card;
    }
}

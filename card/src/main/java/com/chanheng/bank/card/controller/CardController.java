package com.chanheng.bank.card.controller;

import com.chanheng.bank.card.dto.CardDTO;
import com.chanheng.bank.card.entity.Card;
import com.chanheng.bank.card.mapper.CardMapper;
import com.chanheng.bank.card.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("api/cards")
@Slf4j
public class CardController {

    @Autowired
    private CardMapper cardMapper;
    @Autowired
    private CardService cardService;
    @PostMapping
    public ResponseEntity<?> saveCard(@RequestBody CardDTO dto){
        Card card = cardMapper.toCard(dto);
        log.info("CardDTO:::: ={}", dto);
        card.setCreateDate(LocalDate.now());
        card = cardService.saveCard(card);
        return ResponseEntity.ok(card);
    }
    @GetMapping
    public ResponseEntity<?> getCards(){
        return ResponseEntity.ok(cardService.getCards());
    }
    @GetMapping("{cardId}")
    public ResponseEntity<?> getCardById(@PathVariable Long cardId){
        return ResponseEntity.ok(cardService.getCardById(cardId));
    }
}
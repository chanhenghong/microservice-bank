package com.chanheng.bank.card.repository;

import com.chanheng.bank.card.entity.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card, Long> {

}

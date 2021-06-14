package com.github.baklashovanton.atm.server.processing.repository;

import com.github.baklashovanton.atm.server.processing.entity.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardCrudRepository extends CrudRepository<Card, Long> {
}

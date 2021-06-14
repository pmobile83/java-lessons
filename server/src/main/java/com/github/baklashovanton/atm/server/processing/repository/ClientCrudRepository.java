package com.github.baklashovanton.atm.server.processing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.github.baklashovanton.atm.server.processing.entity.Client;

@Repository
public interface ClientCrudRepository extends CrudRepository<Client, Long> {
}

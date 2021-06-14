package com.github.baklashovanton.atm.server.processing.repository;

import com.github.baklashovanton.atm.server.processing.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountCrudRepository extends CrudRepository<Account, Long> {
}

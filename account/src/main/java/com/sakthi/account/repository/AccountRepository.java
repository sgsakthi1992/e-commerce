package com.sakthi.account.repository;

import com.sakthi.account.model.Account;
import org.springframework.data.repository.ListCrudRepository;

public interface AccountRepository extends ListCrudRepository<Account, Long> {

}

package com.sakthi.account.repository;

import com.sakthi.account.model.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Long> {

}

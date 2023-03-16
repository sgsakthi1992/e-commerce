package com.sakthi.account.service;

import com.sakthi.account.model.Account;
import com.sakthi.account.repository.AccountRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

  private final AccountRepository accountRepository;

  public List<Account> getAccounts() {
    return accountRepository.findAll();
  }

}

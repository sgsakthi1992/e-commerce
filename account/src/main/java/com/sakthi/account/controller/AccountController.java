package com.sakthi.account.controller;

import com.sakthi.account.model.Account;
import com.sakthi.account.service.AccountService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
@RequiredArgsConstructor
public class AccountController {

  private final AccountService accountService;

  @GetMapping
  public List<Account> getAccounts() {
    return accountService.getAccounts();
  }
}

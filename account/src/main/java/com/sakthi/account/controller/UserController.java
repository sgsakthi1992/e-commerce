package com.sakthi.account.controller;

import com.sakthi.account.dto.UserDto;
import com.sakthi.account.model.User;
import com.sakthi.account.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@Validated
public class UserController {

  private final UserService userService;

  @GetMapping("/{userId}")
  public User getUser(@PathVariable Long userId) {
    return userService.getUser(userId);
  }

  @PostMapping
  public User createUser(@Valid @RequestBody UserDto userDto){
    return userService.createUser(userDto);
  }
}

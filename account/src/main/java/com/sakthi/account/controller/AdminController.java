package com.sakthi.account.controller;

import com.sakthi.account.dto.AdminDto;
import com.sakthi.account.model.Admin;
import com.sakthi.account.model.User;
import com.sakthi.account.service.AdminService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

  private final AdminService adminService;

  @GetMapping
  public List<User> getUsers() {
    return adminService.getUsers();
  }

  @PostMapping
  public Admin createAdmin(@RequestBody AdminDto adminDto) {
    return adminService.createAdmin(adminDto);
  }
}

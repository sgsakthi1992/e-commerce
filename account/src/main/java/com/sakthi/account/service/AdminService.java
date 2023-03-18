package com.sakthi.account.service;

import com.sakthi.account.converter.AdminConverter;
import com.sakthi.account.dto.AdminDto;
import com.sakthi.account.model.Admin;
import com.sakthi.account.model.User;
import com.sakthi.account.repository.AdminRepository;
import com.sakthi.account.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

  private final UserRepository userRepository;
  private final AdminRepository adminRepository;
  private final AdminConverter adminConverter;

  public List<User> getUsers() {
    return userRepository.findAll();
  }

  public Admin createAdmin(AdminDto adminDto) {
    var admin = adminConverter.convert(adminDto);
    return adminRepository.save(admin);
  }
}

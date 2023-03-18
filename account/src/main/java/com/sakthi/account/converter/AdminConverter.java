package com.sakthi.account.converter;

import com.sakthi.account.dto.AdminDto;
import com.sakthi.account.model.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminConverter {

  public Admin convert(AdminDto adminDto) {
    var admin = new Admin();
    admin.setFirstName(adminDto.firstName());
    admin.setLastName(adminDto.lastName());
    return admin;
  }
}

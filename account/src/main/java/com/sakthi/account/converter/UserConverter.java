package com.sakthi.account.converter;

import com.sakthi.account.dto.UserDto;
import com.sakthi.account.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserConverter {

  public User convert(UserDto userDto) {
    var user = new User();
    user.setFirstName(userDto.firstName());
    user.setLastName(userDto.lastName());
    user.setPhoneNumber(userDto.phoneNumber());
    user.setAddress(userDto.address());
    user.setZipcode(userDto.zipcode());
    return user;
  }
}

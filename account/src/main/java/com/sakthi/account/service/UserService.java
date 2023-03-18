package com.sakthi.account.service;

import com.sakthi.account.converter.UserConverter;
import com.sakthi.account.dto.UserDto;
import com.sakthi.account.exception.UserNotFoundException;
import com.sakthi.account.model.User;
import com.sakthi.account.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final UserConverter userConverter;

  public User getUser(Long userId) {
    return userRepository.findById(userId)
        .orElseThrow(() -> new UserNotFoundException("Invalid user id - User not found"));
  }

  public User createUser(UserDto userDto) {
    var user = userConverter.convert(userDto);
    return userRepository.save(user);
  }
}

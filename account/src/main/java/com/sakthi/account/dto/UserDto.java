package com.sakthi.account.dto;


import jakarta.validation.constraints.NotNull;

public record UserDto(@NotNull String firstName,
                      @NotNull String lastName,
                      @NotNull String address,
                      @NotNull String zipcode,
                      String phoneNumber) {
}

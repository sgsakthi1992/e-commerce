package com.sakthi.account.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Account {

  @Id
  private Long accountId;
  private String firstName;
  private String lastName;
  private String address;
  private String zipcode;
  private String phoneNumber;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    Account account = (Account) o;
    return accountId != null && Objects.equals(accountId, account.accountId);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}

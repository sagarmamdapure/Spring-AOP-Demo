package com.practice.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

  public void addAccount() {
    System.out.println(getClass() + ": Calling addAccount method");
  }
}

package com.practice.aopdemo;

import com.practice.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(DemoConfig.class);
    AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
    accountDAO.addAccount();

    System.out.println("Let's call it again");

    accountDAO.addAccount();

    context.close();
  }
}

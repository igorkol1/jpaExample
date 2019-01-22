package com.jpaexample.demojpa;

import com.jpaexample.demojpa.entity.User;
import com.jpaexample.demojpa.service.UserDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Igor", "Admin");
        System.out.println("Test");
        System.out.println(userDAOService.insert(user));
    }
}

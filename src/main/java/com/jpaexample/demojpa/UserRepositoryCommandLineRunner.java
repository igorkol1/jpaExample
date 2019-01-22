package com.jpaexample.demojpa;

import com.jpaexample.demojpa.entity.User;
import com.jpaexample.demojpa.service.UserDAOService;
import com.jpaexample.demojpa.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Agnieszka", "Admin");
        System.out.println(userRepository.save(user).getId());
    }
}

package com.jpaexample.demojpa;

import com.jpaexample.demojpa.entity.User;
import com.jpaexample.demojpa.service.UserDAOService;
import com.jpaexample.demojpa.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Agnieszka", "Admin");
        System.out.println(userRepository.save(user).getId());

        //Usage of findById
        Optional<User> userOptional = userRepository.findById(1L);
        if (userOptional.isPresent()) {
            System.out.println("User from user repository " + userOptional.get().toString());
        } else {
            System.out.println("User wasn't found");
        }

        //Usage of findAll
        System.out.println("List of all users");
        userRepository.findAll().stream().forEach(userFromList->System.out.println(userFromList.toString()));
    }
}

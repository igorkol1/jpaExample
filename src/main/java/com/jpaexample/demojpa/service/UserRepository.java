package com.jpaexample.demojpa.service;

import com.jpaexample.demojpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

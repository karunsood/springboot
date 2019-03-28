package com.karunsood.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karunsood.assignment.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

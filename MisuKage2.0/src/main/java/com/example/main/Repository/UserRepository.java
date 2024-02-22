package com.example.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

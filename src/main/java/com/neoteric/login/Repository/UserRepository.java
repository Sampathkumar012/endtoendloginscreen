package com.neoteric.login.Repository;


import com.neoteric.login.userentity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


import com.neoteric.login.userentity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    User findByEmail(String email); // for login
}

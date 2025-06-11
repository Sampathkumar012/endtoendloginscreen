package com.neoteric.login.Repository;


import com.neoteric.login.userentity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


import com.neoteric.login.userentity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

package com.miniuser_api.miniuser_api.repository;

import com.miniuser_api.miniuser_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Query method personalizzato
    User findByEmail(String email);
}
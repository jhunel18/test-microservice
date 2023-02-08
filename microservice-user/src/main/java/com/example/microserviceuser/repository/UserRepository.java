package com.example.microserviceuser.repository;

import com.example.microserviceuser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

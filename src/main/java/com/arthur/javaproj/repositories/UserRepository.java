package com.arthur.javaproj.repositories;

import com.arthur.javaproj.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.accenture.javasquad.mastodonclient.repositories;

import com.accenture.javasquad.mastodonclient.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

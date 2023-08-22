package com.accenture.javasquad.mastodonclient.repositories;

import com.accenture.javasquad.mastodonclient.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

package com.accenture.javasquad.mastodonclient.repositories;

import com.accenture.javasquad.mastodonclient.entities.Post;
import com.accenture.javasquad.mastodonclient.entities.PostUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostUpdateRepository extends JpaRepository<PostUpdate, Post> {
}

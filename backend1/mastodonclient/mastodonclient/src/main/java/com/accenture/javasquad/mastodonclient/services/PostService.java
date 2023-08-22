package com.accenture.javasquad.mastodonclient.services;

import com.accenture.javasquad.mastodonclient.entities.Post;
import com.accenture.javasquad.mastodonclient.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> readAllPosts() {

        return postRepository.findAll();
    }

    public Post addPost(Post post) {

        return postRepository.save(post);
    }
}

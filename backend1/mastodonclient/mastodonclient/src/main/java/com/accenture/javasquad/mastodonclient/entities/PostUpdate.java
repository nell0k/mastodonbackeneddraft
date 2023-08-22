package com.accenture.javasquad.mastodonclient.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="postupdate")
@Setter
@Getter

public class PostUpdate {
    @EmbeddedId
    private PostUpdateId postUpdateId;

    @Column (name="text")
    private String text;

    @ManyToOne
    @JoinColumn(name="postid",insertable=false, updatable=false)
    private Post post;





}
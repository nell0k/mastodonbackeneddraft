package com.accenture.javasquad.mastodonclient.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table (name="post")
@Setter
@Getter

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="privacy")
    private Integer privacy;

    @Column (name="status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private User user;


}

package com.accenture.javasquad.mastodonclient.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
@Setter
@Getter
public class PostUpdateId implements Serializable {
    @Column(name="postid")
    private Long postId;

    @Temporal(TemporalType.DATE)
    @Column(name="time")
    private Date time;
}

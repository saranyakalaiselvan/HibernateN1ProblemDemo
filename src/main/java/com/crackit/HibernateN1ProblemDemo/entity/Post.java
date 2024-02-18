package com.crackit.HibernateN1ProblemDemo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@NamedQuery(name = "listOfPosts", query = "Select p from Post p JOIN FETCH p.postComments")
public class Post {
    @Id
    private Integer id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    private List<PostComments> postComments;

/*    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    private List<Like> likes;*/
}

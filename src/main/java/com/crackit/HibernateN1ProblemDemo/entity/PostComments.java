package com.crackit.HibernateN1ProblemDemo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@NamedQuery(name = "listOfPostComments",
query = "Select pc from PostComments pc")
public class PostComments {

    @Id
    private Integer id;
    private String name;
}

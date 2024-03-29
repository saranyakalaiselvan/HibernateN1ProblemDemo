package com.crackit.HibernateN1ProblemDemo.repository;

import com.crackit.HibernateN1ProblemDemo.entity.Post;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

//    @Query("Select p from Post p JOIN FETCH p.postComments")
//    List<Post> findAllWithComments();

    @EntityGraph(attributePaths = "postComments")
    List<Post> findAllWithComments();

}

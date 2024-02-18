package com.crackit.HibernateN1ProblemDemo.repository.impl;

import com.crackit.HibernateN1ProblemDemo.entity.Post;
import com.crackit.HibernateN1ProblemDemo.repository.PostRepository;
import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class PostRepositoryImpl  {

    @PersistenceContext
    private EntityManager entityManager;
    public List<Post> findAllWithComments() {
        EntityGraph<Post> entityGraph = entityManager.createEntityGraph(Post.class);
        entityGraph.addSubgraph("postComments");
        return entityManager.createQuery(
                "select p from Post p"
        ).setHint("javax.persistence.loadgraph", entityGraph)
                .getResultList();
    }
}

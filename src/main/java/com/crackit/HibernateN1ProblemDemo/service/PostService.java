package com.crackit.HibernateN1ProblemDemo.service;

import com.crackit.HibernateN1ProblemDemo.entity.Post;
import com.crackit.HibernateN1ProblemDemo.repository.PostRepository;
import com.crackit.HibernateN1ProblemDemo.repository.impl.PostRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    private final PostRepositoryImpl postRepositoryImpl;

    public List<Post> getPosts() {
        //return postRepository.findAll();
        return postRepository.findAllWithComments();
        //return postRepositoryImpl.findAllWithComments();
    }

    public Post savePosts(Post post) {
            return postRepository.save(post);
    }
}

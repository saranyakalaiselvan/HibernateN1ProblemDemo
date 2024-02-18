package com.crackit.HibernateN1ProblemDemo.controller;

import com.crackit.HibernateN1ProblemDemo.entity.Post;
import com.crackit.HibernateN1ProblemDemo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crackit/v1")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;


    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    @PostMapping("/posts")
    public Post savePosts(@RequestBody Post post) {
        return postService.savePosts(post);
    }
}

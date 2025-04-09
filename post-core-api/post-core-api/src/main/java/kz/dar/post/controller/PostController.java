package kz.dar.post.controller;

import kz.dar.post.model.PostRequest;
import kz.dar.post.model.PostResponse;
import kz.dar.post.service.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")

public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/check")
    private String checkPostApi() {
        return "App is working";
    }

    @PostMapping
    public PostResponse createPost(@RequestBody PostRequest postRequest) {
        return postService.createPost(postRequest);
    }
    @GetMapping("/all")
    public List<PostResponse> getAllPosts() {
        return postService.getAllPosts();
    }

    @PutMapping
    public PostResponse updatePost(@RequestParam String postId, @RequestBody PostRequest postRequest) {
        return postService.getPostById(postId);
    }

    @DeleteMapping
    public void deletePost(@RequestParam String postId) {
        postService.deletePostById(postId);
    }

}

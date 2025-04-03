package kz.dar.post.service;

import kz.dar.post.model.PostModel;

import java.util.List;

public interface PostService {
    void createPost (PostModel postModel);
    List<PostModel> getPosts ();
    PostModel getPostById (String postId);
    void updatePostById (String postId, PostModel postModel);
    void deletePostById (String postId);
}

//package kz.dar.post.controller;
//
//import jakarta.validation.Valid;
//import kz.dar.post.model.PostModel;
//import kz.dar.post.service.deprecated.PostServiceOld;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/deprecated/post")
//public class PostControllerOld {
//    @Autowired
//    Environment env;
//
//    @Autowired
//    private PostServiceOld postServiceOld;
//
//    @GetMapping ("/check")
//    public String checkPostApi() {
//        return "Post-core-api is working at "+env.getProperty("local.server.port");
//    }
//
//    @PostMapping()
//    public ResponseEntity<String> createPost(@Valid @RequestBody PostModel postModel ) {
//        postServiceOld.createPost(postModel);
//        return new ResponseEntity<String>("Successfully created", HttpStatus.OK);
//    }
//
//    @GetMapping("/all")
//    public List<PostModel> getPosts() {
//        return postServiceOld.getPosts();
//    }
//
//    @GetMapping("/{postId}")
//    public PostModel getPostById(@PathVariable String postId) {
//
//        return postServiceOld.getPostById(postId);
//    }
//
//    @PutMapping("/{postId}")
//    public ResponseEntity<String> updatePostById(@Valid @PathVariable String postId,
//                                                 @RequestBody PostModel postModel) {
//        postServiceOld.updatePostById(postId, postModel);
//        return new ResponseEntity<String>("Successfully updated", HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{postId}")
//    public ResponseEntity<String> deletePostById(@PathVariable String postId) {
//        postServiceOld.deletePostById(postId);
//        return new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
//    }
//
//}

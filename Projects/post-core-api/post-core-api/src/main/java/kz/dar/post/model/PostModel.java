package kz.dar.post.model;

import jakarta.validation.constraints.NotNull;
import lombok.*;


@Data
@NoArgsConstructor

public class PostModel {

    private String postId;

    @NotNull(message = "Please enter your ID")
    private String clientId;

    @NotNull (message = "Please enter recipient's ID")
    private String postRecipientId;

    @NotNull (message = "Please enter item")
    private String postItem;

    private String status;

    public PostModel(String postId, String clientId, String postRecipientId, String postItem, String status) {
        this.postId = postId;
        this.clientId = clientId;
        this.postRecipientId = postRecipientId;
        this.postItem = postItem;
        this.status = status;
    }

    public String getPostId() {
        return postId;
    }

    public @NotNull(message = "Please enter your ID") String getClientId() {
        return clientId;
    }

    public @NotNull(message = "Please enter recipient's ID") String getPostRecipientId() {
        return postRecipientId;
    }

    public @NotNull(message = "Please enter item") String getPostItem() {
        return postItem;
    }

    public String getStatus() {
        return status;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setClientId(@NotNull(message = "Please enter your ID") String clientId) {
        this.clientId = clientId;
    }

    public void setPostRecipientId(@NotNull(message = "Please enter recipient's ID") String postRecipientId) {
        this.postRecipientId = postRecipientId;
    }

    public void setPostItem(@NotNull(message = "Please enter item") String postItem) {
        this.postItem = postItem;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}



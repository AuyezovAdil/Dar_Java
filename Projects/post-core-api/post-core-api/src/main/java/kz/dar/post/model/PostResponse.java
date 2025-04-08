package kz.dar.post.model;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor



public class PostResponse {

    private String postId;

    private String clientId;

    private String postRecipientId;

    private String postItem;

    private String status;

    public PostResponse(String postId, String clientId, String postRecipientId, String postItem, String status) {
        this.postId = postId;
        this.clientId = clientId;
        this.postRecipientId = postRecipientId;
        this.postItem = postItem;
        this.status = status;
    }

    public String getPostId() {
        return postId;
    }

    public String getClientId() {
        return clientId;
    }

    public String getPostRecipientId() {
        return postRecipientId;
    }

    public String getPostItem() {
        return postItem;
    }

    public String getStatus() {
        return status;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setPostRecipientId(String postRecipientId) {
        this.postRecipientId = postRecipientId;
    }

    public void setPostItem(String postItem) {
        this.postItem = postItem;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


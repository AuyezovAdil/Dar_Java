package kz.dar.post.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "post_list")
@Data
@NoArgsConstructor

public class PostEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String postId;
    @Column(nullable = false, length = 50)
    private String clientId;
    @Column(nullable = false, length = 50)
    private String postRecipientId;
    @Column(nullable = false, length = 50)
    private String postItem;
    @Column(nullable = false, length = 50)
    private String status;

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
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

    public PostEntity(Long id, String postId, String clientId, String postRecipientId, String postItem, String status) {
        this.id = id;
        this.postId = postId;
        this.clientId = clientId;
        this.postRecipientId = postRecipientId;
        this.postItem = postItem;
        this.status = status;
    }
}

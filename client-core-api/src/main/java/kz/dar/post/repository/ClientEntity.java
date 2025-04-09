package kz.dar.post.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "client_list")

public class ClientEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column (unique = true)
    private String clientId;
    @Column (nullable = false, length = 50)
    private String name;
    @Column (nullable = false, length = 50)
    private String surname;
    @Column (nullable = false, length = 50)
    private String email;

    public ClientEntity(Long id, String clientId, String name, String surname, String email) {
        this.id = id;
        this.clientId = clientId;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

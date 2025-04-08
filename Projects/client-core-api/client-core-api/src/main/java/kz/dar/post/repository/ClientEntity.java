package kz.dar.post.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "client_list")
@NoArgsConstructor
@AllArgsConstructor
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
}

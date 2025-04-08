package kz.dar.post.ClientModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ClientResponse {
    private String clientId;

    private String name;

    private String surname;

    private String email;
}

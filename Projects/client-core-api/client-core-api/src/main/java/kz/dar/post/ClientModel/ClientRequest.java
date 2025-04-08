package kz.dar.post.ClientModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {
    private String clientId;

    @NotNull(message = "Please enter your name")
    private String name;

    @NotNull (message = "Please enter your surname")
    private String surname;

    @Email(message = "Incorrect email address")
    private String email;
}

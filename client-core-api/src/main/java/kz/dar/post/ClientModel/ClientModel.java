package kz.dar.post.ClientModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ClientModel {

    private String clientId;

    @NotNull(message = "Please enter your name")
    private String name;

    @NotNull(message = "Please enter your surname")
    private String surname;

    @Email(message = "Incorrect email address")
    private String email;
}



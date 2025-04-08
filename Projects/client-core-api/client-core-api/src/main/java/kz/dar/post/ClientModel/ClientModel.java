package kz.dar.post.ClientModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientModel {

    private String clientId;

    @NotNull (message = "Please enter your name")
    private String name;

    @NotNull (message = "Please enter your surname")
    private String surname;

    @Email (message = "Incorrect email address")
    private String email;

    public ClientModel(String clientId, String name, String surname, String email) {
        this.clientId = clientId;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getClientId() {
        return clientId;
    }

    public @NotNull(message = "Please enter your name") String getName() {
        return name;
    }

    public @NotNull(message = "Please enter your surname") String getSurname() {
        return surname;
    }

    public @Email(message = "Incorrect email address") String getEmail() {
        return email;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setName(@NotNull(message = "Please enter your name") String name) {
        this.name = name;
    }

    public void setSurname(@NotNull(message = "Please enter your surname") String surname) {
        this.surname = surname;
    }

    public void setEmail(@Email(message = "Incorrect email address") String email) {
        this.email = email;
    }
}

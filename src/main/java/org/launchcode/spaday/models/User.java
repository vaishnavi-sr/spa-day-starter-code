package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "Username is required")
    @Size(min=5, max=15,message = "UserName should be between 5-15 characters")
    private String username;
    @Email(message = "Email format is not correct.")
    private String email;

    @Size(min=6, message = "Password should be at least 6 characters.")
    private String password;


    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public User() {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

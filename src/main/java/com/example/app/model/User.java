package com.example.app.model;

import com.example.app.modelInterface.Same;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
public class User implements Same<User> {
    @NotNull(message = "Name cannot be null")
    private String name;

    public User(String name) {
        this.name = name;
    }

    public boolean isSame(User user){
        return this.equals(user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }
}

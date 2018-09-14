package com.example.app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Share {
    private User user;
    private double denomination;

    public Share(User user, double denomination) {
        this.user = user;
        this.denomination = denomination;
    }

    public User getUser() {
        return user;
    }

    public double getDenomination() {
        return denomination;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDenomination(double denomination) {
        this.denomination = denomination;
    }
}

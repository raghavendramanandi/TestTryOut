package com.example.app.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldEvaluateSameUsersAsTrue() {
        User user1 = new User("testUser");
        User user2 = new User("testUser");
        assertTrue(user1.isSame(user2));
    }

    @Test
    public void shouldEvaluateDifferentUsersAsFalse() {
        User user1 = new User("testUser");
        User user2 = new User("testUser1");
        assertFalse(user1.isSame(user2));
    }

}
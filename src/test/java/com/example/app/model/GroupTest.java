package com.example.app.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GroupTest {
    @Test
    public void ShouldEvaluateTrueIfAllTheUsersBelongToGroup() {
        List<User> users = new ArrayList<>();
        users.add(new User("a"));
        users.add(new User("b"));
        users.add(new User("c"));
        users.add(new User("d"));
        users.add(new User("e"));

        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("a"));
        testUsers.add(new User("b"));
        testUsers.add(new User("c"));
        testUsers.add(new User("d"));

        Group group = new Group("g1", users);
        assertTrue(group.validate(testUsers));
    }

    @Test
    public void ShouldEvaluateFalseIfSomeOfTheUsersDoesNotBelongToGroup() {
        List<User> users = new ArrayList<>();
        users.add(new User("a"));
        users.add(new User("b"));
        users.add(new User("c"));
        users.add(new User("d"));
        users.add(new User("e"));

        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("a"));
        testUsers.add(new User("b"));
        testUsers.add(new User("c"));
        testUsers.add(new User("d1"));

        Group group = new Group("g1", users);
        assertFalse(group.validate(testUsers));
    }

}
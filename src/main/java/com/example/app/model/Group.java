package com.example.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Group {
    private List<User> users;
    private String groupName;

    public Group(String groupName, List<User> users) {
        this.groupName = groupName;
        this.users = users;
    }

    public boolean validate(List<User> users){
        for (User user :
                users) {
            if(!validateUser(user)){
                return false;
            }
        }
        return true;
    }

    private boolean validateUser(User user) {
        for (User groupUser : this.users) {
            if( groupUser.isSame(user)){
                return true;
            }
        }
        return false;
    }
}

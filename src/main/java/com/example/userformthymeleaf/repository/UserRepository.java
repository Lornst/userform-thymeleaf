package com.example.userformthymeleaf.repository;

import com.example.userformthymeleaf.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();
    private int userId;


    private int nextUserId() {
        return ++userId;
    }

    public List<User> getAllUsers(){
        return users;
    }

    public User addUser(User user){
        user.setUserId(nextUserId());
        users.add(user);
        return user;
    }


    public User getUserById(int userId) {
        for(User tempUser: users){
            if(tempUser.getUserId() == userId){
                return tempUser;
            }
        }

        return null;
    }

    public User updateUser(User user) {
        User tempUser = getUserById(user.getUserId());

        if(tempUser != null){
            tempUser.setName(user.getName());
            tempUser.setEmail(user.getEmail());
            tempUser.setUserRole(user.getUserRole());

            return tempUser;
        }

        return null;
    }
}

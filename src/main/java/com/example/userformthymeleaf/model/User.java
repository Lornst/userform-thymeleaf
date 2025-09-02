package com.example.userformthymeleaf.model;

public class User {
    private int userId;
    private String name;
    private String email;
    private UserRole userRole;

    public User(int userId, String name, String email, UserRole userRole) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.userRole = userRole;
    }

    //Tom constructor til objekt kald uden argumenter
    public User(){}

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}

package com.example.homework1marz;

public class User {

    private int login;

    public User(int login, int email) {
        this.login = login;
        this.email = email;
    }

    private int email;

    public int getLogin() {
        return login;
    }

    public int getEmail() {
        return email;
    }
}
package com.example.d_chatbajud1;

public class User_Profile {

    public String username,userUID;

    public User_Profile(String username) {
        this.username = username;
    }

    public User_Profile(String username, String userUID) {

        this.username = username;
        this.userUID = userUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserUID() {
        return userUID;
    }

    public void setUserUID(String userUID) {
        this.userUID = userUID;
    }
}

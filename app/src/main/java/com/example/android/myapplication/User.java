package com.example.android.myapplication;

public class User  {

    private  boolean userGender;
    private String username;
    private String lastUpdateDate;

    public boolean isWoman() {
        return userGender;
    }

    public void setUserGender(boolean userGender) {
        this.userGender = userGender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public User(boolean userGender, String username, String lastUpdateDate) {
        this.userGender = userGender;
        this.username = username;
        this.lastUpdateDate = lastUpdateDate;
    }



}
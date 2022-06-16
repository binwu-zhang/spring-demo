package com.atbinwu.spring5.entity;

public class Book {
    private Integer userId;
    private String username;
    private String userstatus;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getUserstatus() {
        return userstatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userstatus='" + userstatus + '\'' +
                '}';
    }
}

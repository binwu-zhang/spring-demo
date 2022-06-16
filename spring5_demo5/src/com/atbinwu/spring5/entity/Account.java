package com.atbinwu.spring5.entity;

public class Account {
    private String id;
    private String username;
    private Integer money;

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Integer getMoney() {
        return money;
    }
}

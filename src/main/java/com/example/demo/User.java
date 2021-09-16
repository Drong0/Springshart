package com.example.demo;

public class User {
    private String name;
    private String surName;
    private String phoneNamber;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNamber() {
        return phoneNamber;
    }

    public void setPhoneNamber(String phoneNamber) {
        this.phoneNamber = phoneNamber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User(String name, String surName, String phoneNamber, Long id) {
        this.name = name;
        this.surName = surName;
        this.phoneNamber = phoneNamber;
        this.id = id;
    }
}

package com.in28minutes.learning.jpa.jpain10steps.entity;

// Table - User

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    // JPA needs a default constructor
    protected User() {
    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String role;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

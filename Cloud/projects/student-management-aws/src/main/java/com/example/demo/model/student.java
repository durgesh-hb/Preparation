package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {

    @Id
    private int id;

    private String name;

    private int sem;

    private String email;

    public student() {
    }

    public student(int id, String name, int sem, String email) {
        this.id = id;
        this.name = name;
        this.sem = sem;
        this.email = email;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getsem() {
        return sem;
    }

    public void setsem(int sem) {
        this.sem = sem;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
}
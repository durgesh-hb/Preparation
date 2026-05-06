package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document //means data should store in this formate
public class  student {

    @Id // means id is the primary key here
    private int id;
    private String name;
    private int sem;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getid(){
        return id;
    }

    public void setid(int id){
        this.id=id;
    }

    public String getname(){

        return name;
    }

    public void setname(String name){
        this.name=name;
    }

    public int getsem(){
        return sem;
    }

    public void setsem(int sem){
        this.sem=sem;
    }
}
package com.example.demo.controller;

import com.example.demo.model.user;
import com.example.demo.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class usercontroller {

    @Autowired
    private userservice userserv;

    @PostMapping("/add")
    public String addstudent(@RequestBody user stu){
        userserv.savestudent(stu);
        return "New student added";
    }

    @GetMapping("/allstu")
    public List<user> getallstu(){
        return userserv.getallstu();
    }

    @PutMapping()
    public String upadted(@RequestBody user stu){
        user userindb = userserv.findbyusername(stu.getUsername());
        if(userindb != null){
            userindb.setUsername(stu.getUsername());
            userindb.setPassword(stu.getPassword());
            userserv.savestudent(userindb);
        }
        return "updated";
    }

}

package com.example.demo.service;

import com.example.demo.model.student;
import com.example.demo.model.user;
import com.example.demo.repository.userrepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userservice {

    @Autowired
    private userrepo userdb;

    public void savestudent(user stu){
        userdb.save(stu);
    }

    public void deletestudent(ObjectId id){
        userdb.deleteById(id);
    }

    public List<user> getallstu(){
        return userdb.findAll();
    }

    public Optional<user> finduser(ObjectId id){
        return userdb.findById(id);
    }

    public user findbyusername(String username){
        return userrepo.findbyusername(username);
    }

}

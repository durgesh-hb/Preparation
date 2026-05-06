package com.example.demo.service;

import com.example.demo.model.student;
import com.example.demo.repository.entryrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// marks this as business layer
@Service
public class entryservice {

    @Autowired //bean injection
    private entryrepo repo;

    // controller should NOT directly talk to database so we use the service layer

    //this all methods will can be the called by controller(studentcontroller)
    //they all are corresponding to the controller methods

    //every method here call's the entryrepo which directly talk to DB
    public void savestu(student stu){
        repo.save(stu);
    }

    public List<student> getallstu(){
        return repo.findAll();
    }

    //to find by id
    public Optional<student> findbyid(int id){
        return repo.findById(id);
    }

    public void deletebyid(int id){
        repo.deleteById(id);
    }


}

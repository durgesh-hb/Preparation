package com.example.demo.controller;

import com.example.demo.model.student;
import com.example.demo.service.entryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/students")
public class studentcontroller {

    //flow of request is
    //***importent***
    //studentcontroller --> entryservice --> entryrepo(DB)

    //every method here call his corresponding methode defined in service repo
//
//     controller for endpoints
//    Controller receives HTTP requests and decides what code should run



    @Autowired // dependency injection object automatically
    private entryservice entryservice;

    @PostMapping("/addstu")
    public String addstu(@RequestBody student mystu){
        mystu.setDate(new Date());
        entryservice.savestu(mystu);
        return "student added";
    }

    @GetMapping("id/{id}")
    public student findstu(@PathVariable int id){
       return entryservice.findbyid(id).orElse(null);
    }

    @DeleteMapping("del/{id}")
    public String delete(@PathVariable int id){
        entryservice.deletebyid(id);
        return "deleted";
    }

    @GetMapping("getall")
    public List<student> getall(){
        return entryservice.getallstu();
    }

    @PutMapping("id/{id}")
    public student updatebyid(@PathVariable int id, @RequestBody student stu){
        student temp = entryservice.findbyid(id).orElse(null);
        if(temp != null){
            temp.setname(stu.getname() != null && !stu.getname().equals("") ? stu.getname() : temp.getname());
            temp.setsem(stu.getsem() != 0 ? stu.getsem() : temp.getsem());        }
        entryservice.savestu(temp);
        return temp;
    }
}
package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController // tell spring boot that this handle API'S, HTTP Request
@RequestMapping("/students")
public class myclass {

    @GetMapping("/hello")
    public String getstudents(){
        return "Getting all students";
    }

    @PostMapping
    public String addstudent(){
        return "Student added";
    }

    @PutMapping("/{id}")
    public String updatestudent(@PathVariable int id){
        return "Student updated " + id;
    }

    @DeleteMapping("/{id}")
    public String deletestudent(@PathVariable int id){
        return "student deleted" + id;
    }

}
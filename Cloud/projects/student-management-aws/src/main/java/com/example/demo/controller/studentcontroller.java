package com.example.demo.controller;

import com.example.demo.model.student;
import com.example.demo.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class studentcontroller {

    private final StudentRepository studentRepository;

    public studentcontroller(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/allstu")
    public List<student> getall() {
        return studentRepository.findAll();
    }

    @PostMapping("/addstu")
    public String addstu(@RequestBody student mystu) {
        studentRepository.save(mystu);
        return "Student added";
    }

    @GetMapping("/id/{id}")
    public student findstu(@PathVariable int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/del/{id}")
    public String delete(@PathVariable int id) {
        studentRepository.deleteById(id);
        return "deleted";
    }

    @PutMapping("/id/{id}")
    public String updatebyid(@PathVariable int id, @RequestBody student stu) {
        stu.setid(id);
        studentRepository.save(stu);
        return "Student " + id + " updated";
    }
}
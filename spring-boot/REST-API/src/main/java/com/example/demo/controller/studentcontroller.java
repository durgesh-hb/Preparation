package com.example.demo.controller;

import com.example.demo.model.student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class studentcontroller {
    // temporary storage: id -> student object
    Map<Integer, student> studata = new HashMap<>();

    @GetMapping("/allstu")
    public List<student> getall(){
        return new ArrayList<>(studata.values());
    }

    @PostMapping("/addstu")
    public String addstu(@RequestBody student mystu){
        // store student using id as key
        studata.put(mystu.getid(), mystu);
        return "Student added";
    }

    @GetMapping("id/{id}")
    public student findstu(@PathVariable int id){
        return studata.get(id);
    }

    @DeleteMapping("del/{id}")
    public String delete(@PathVariable int id){
         studata.remove(id);
         return "deleted";
    }

    @PutMapping("id/{id}")
    public String updatebyid(@PathVariable int id, @RequestBody student stu){
        studata.put(id,stu);
        return "Student " + id + " updated";
    }
}

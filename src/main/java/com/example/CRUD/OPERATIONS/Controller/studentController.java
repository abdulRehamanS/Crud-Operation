package com.example.CRUD.OPERATIONS.Controller;


import com.example.CRUD.OPERATIONS.Entity.student;
import com.example.CRUD.OPERATIONS.Service.serviceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class studentController {


    @Autowired
    serviceImple service;

    @GetMapping("/")
    public String getMsg() {
        return "Url working";
    }


    @PostMapping("/add")
    public String addStudent(@RequestBody student student) {
        return service.addStudent(student);

    }


    // updating all the students
    @PostMapping("/update")
    public String updateStudent(@RequestBody student student) {
        return service.updateStudent(student);
    }


    // display all the students
    @GetMapping("/display")
    public List<student> getStudentList() {
        return service.getStudentList();
    }


    // getting by student id
    @GetMapping("get/{id}")
    public Optional<student> getStudentById(@PathVariable Integer id) {
        return service.getStudentById(id);
    }


    //delete student by student id
    @DeleteMapping("delete/{id}")
    public String deleteById(@PathVariable Integer id) {
        return service.deleteById(id);
    }
}

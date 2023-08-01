package com.example.CRUD.OPERATIONS.Service;

import com.example.CRUD.OPERATIONS.Entity.student;

import java.util.List;
import java.util.Optional;

public interface serviceInterface {

    public String addStudent(student student);


    // updating all the students
    public String updateStudent(student student);


    //update all the students
    public List<student> getStudentList();


    // getting by student id
    public Optional<student> getStudentById(Integer id);


    //delete student by student id
    public String deleteById(Integer id);
}

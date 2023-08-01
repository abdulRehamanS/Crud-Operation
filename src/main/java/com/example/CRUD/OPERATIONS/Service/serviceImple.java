package com.example.CRUD.OPERATIONS.Service;

import com.example.CRUD.OPERATIONS.Entity.student;
import com.example.CRUD.OPERATIONS.Repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class serviceImple implements serviceInterface {


    @Autowired
    studentRepo repo;

    @Override
    public String addStudent(student student) {
        repo.save(student);
        if (student.getId() != null) {
            return "Student added successfully";
        }
        return "Student Not Found";
    }

    @Override
    public String updateStudent(student student) {
        if (repo.existsById(student.getId())) {
            return "Student Updated successfully";
        }
        return "Student Not Found";
    }

    @Override
    public List<student> getStudentList() {
        return repo.findAll();
    }

    @Override
    public Optional<student> getStudentById(Integer id) {
        return Optional.of(repo.findById(id).get());

    }

    @Override
    public String deleteById(Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Student deleted successfully";
        }
        return "student not found";
    }
}

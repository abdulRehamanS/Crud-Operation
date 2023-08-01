package com.example.CRUD.OPERATIONS.Repository;

import com.example.CRUD.OPERATIONS.Entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<student,Integer> {
}

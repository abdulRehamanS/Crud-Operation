package com.example.CRUD.OPERATIONS.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Student_List")
@Data
public class student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(name = "Name")
    String name;
    @Column(name = "Email")
    String email;
    @Column(name = "Mobile")
    Long phoneNo;
}

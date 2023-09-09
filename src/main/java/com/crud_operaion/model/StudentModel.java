package com.crud_operaion.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "Student_Table")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String department;

}

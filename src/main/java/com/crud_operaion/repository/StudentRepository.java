package com.crud_operaion.repository;

import com.crud_operaion.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

    StudentModel findById(int id);
}

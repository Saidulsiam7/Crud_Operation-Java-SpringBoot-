package com.crud_operaion.controller;
import com.crud_operaion.model.StudentModel;
import com.crud_operaion.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class StudentController {
    @Autowired
    StudentService service;

    // CREATE STUDENT INFORMATION
    @PostMapping("/create")
    public StudentModel Create(@RequestBody StudentModel studentModel) {
        return service.Create(studentModel);
    }

    // VIEW ALL STUDENT INFORMATION
    @GetMapping("/viewAll")
    public List <StudentModel> ViewAll(){
        return service.ViewAll();
    }

    // SINGLE STUDENT INFORMATION VIEW
    @GetMapping("/view/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        try {
            StudentModel get = service.View(id);
            return ResponseEntity.ok(get);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    // UPDATE STUDENT INFORMATION
    @PutMapping("/view/update")
    public StudentModel Update(@RequestBody StudentModel studentModel) {
        return service.Update(studentModel);
    }

    // FOR DELETE
    @DeleteMapping("/view/delete/{id}")
    public String Delete(@PathVariable int id) {
        return service.Delete(id);
    }






}

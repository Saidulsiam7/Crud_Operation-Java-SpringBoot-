package com.crud_operaion.service;
import com.crud_operaion.model.StudentModel;
import com.crud_operaion.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
@Autowired
   private StudentRepository repository;
    public StudentModel Create(StudentModel studentModel){
        return repository.save(studentModel);
    }
    public List<StudentModel> ViewAll(){
        return repository.findAll();
    }
    public StudentModel View(int id){

        StudentModel ob= repository.findById(id);
        if(ob==null){
            throw new RuntimeException("This Id not present in Database");
        }
        return ob;

    }
    public StudentModel Update(StudentModel studentModel){
        StudentModel oldStudent = repository.findById(studentModel.getId());
        oldStudent.setName(studentModel.getName());
        oldStudent.setAge(studentModel.getAge());
        oldStudent.setDepartment(studentModel.getDepartment());
        return repository.save(oldStudent);
    }
    public String Delete(int id){
        repository.deleteById(id);
        return "DELETED";
    }

}

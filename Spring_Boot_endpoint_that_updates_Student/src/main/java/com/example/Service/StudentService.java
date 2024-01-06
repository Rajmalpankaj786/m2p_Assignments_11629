package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Student;
import com.example.Exception.NotFoundException;
import com.example.Repositery.StudentRepo;

@Service
public class StudentService {
   @Autowired
   private StudentRepo studentRepo;
   
   public Student addStudent(Student student) {
	   return studentRepo.save(student);
   }
   
   public List<Student> viewStudent(){
	   return studentRepo.findAll();
   }
   
   public Student updateStudent(Integer id , Student st) {
	   Student op = studentRepo.findById(id).orElseThrow(() -> new NotFoundException("Student not found"));
	   op.setName(st.getName());
	   op.setAge(st.getAge());
	   return studentRepo.save(op);
   }
}

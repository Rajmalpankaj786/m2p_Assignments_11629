package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Entity.Student;
import com.example.Service.StudentService;

import lombok.extern.slf4j.Slf4j;




@RestController
@RequestMapping(value = "/students")
@Slf4j
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/post")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		log.info("Inside the Student PostMapping");
		return new ResponseEntity<Student>(studentService.addStudent(student) , HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/view")
	public ResponseEntity<List<Student>> viewStudent(){
		log.info("Inside the Student GetMapping");
		return new ResponseEntity<List<Student>>(studentService.viewStudent(),HttpStatus.OK);
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Integer id, @RequestBody Student student){
		log.info("Inside the Student PutMapping");
		return new ResponseEntity<Student>(studentService.updateStudent(id, student) ,HttpStatus.OK);
	}
}

package com.example.restdemo.controller;

import com.example.restdemo.data.Student;
import com.example.restdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping(path = "/students")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudents(student);
    }

    @GetMapping(path = "/student/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping(path = "/student/{id}")
    public void deleteStudentById(@PathVariable int id){
        studentService.deleteStudentById(id);
    }

    @PutMapping(path = "/student/{id}")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
}

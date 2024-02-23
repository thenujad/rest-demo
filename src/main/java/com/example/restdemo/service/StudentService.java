package com.example.restdemo.service;

import com.example.restdemo.data.Student;
import com.example.restdemo.data.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student createStudents(Student student)
    {
        return studentRepository.save(student);
    }

    public Student getStudentById(int id){
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }

    public void deleteStudentById(int id){
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

}


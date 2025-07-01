package com.example.springDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {
    //List<Student> students = new ArrayList<>(List.of(new Student("ali",)))
    @Autowired
    private StudentService service;
    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getStudents();
    }
}

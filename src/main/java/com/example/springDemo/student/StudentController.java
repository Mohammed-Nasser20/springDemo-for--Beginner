package com.example.springDemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {
    @GetMapping("/students")
    public List<String> getStudent(){
        return List.of(
                "ali",
                "ahmed"
        );
    }
}

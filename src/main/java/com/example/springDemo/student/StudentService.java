package com.example.springDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student("ali",
                        "ali",
                        LocalDate.now(),
                        "jl@gmail.com",
                        1),
                new Student("ahmed",
                        "ali", LocalDate.now(),
                        "hkiuyi@gmail.com",
                        2)
        );
    }
}

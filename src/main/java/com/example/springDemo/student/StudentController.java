package com.example.springDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/students")
    public Student save(@RequestBody Student student) {
        return service.save(student);
    }
    @GetMapping("/students/{email}")
    public Student findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }
    @PutMapping("/students")
    public Student update(@RequestBody Student student){
        return service.update(student);
    }
    @DeleteMapping("/students/{email}")
    public void delete(@PathVariable String email) {
        service.delete(email);
    }
}

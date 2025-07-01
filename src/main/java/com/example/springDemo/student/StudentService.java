package com.example.springDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepo;

    public StudentService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student save(Student student) {
        return studentRepo.save(student);
    }

    public Student findByEmail(String email) {
        return studentRepo.findbyEmail(email);
    }

    public Student update(Student student) {
        return studentRepo.update(student);
    }

    public void delete(String email) {
        studentRepo.delete(email);
    }

    public List<Student> getStudents() {
        return studentRepo.getStudents();
    }
}

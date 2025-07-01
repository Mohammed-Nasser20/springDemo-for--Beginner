package com.example.springDemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class StudentRepository {
    private final List<Student> STUDENT = new ArrayList<>();

    public Student save(Student student) {
        STUDENT.add(student);
        return student;
    }

    public Student findbyEmail(String email) {
            for(var s : STUDENT){
                if (Objects.equals(s.getEmail(), email))
                    return s;
            }
            return null;
    }

    public Student update(Student student) {
        Student student1 = findbyEmail(student.getEmail());
        int i = -1, j = 0;
        for(var s : STUDENT) {

            if (Objects.equals(student.getEmail(), s.getEmail())){
                i = j;
                break;
            }j++;
        }
        if (i != -1) {
                STUDENT.set(i, student1);
                return student;
        }
        return null;

    }

    public void delete(String email) {
        Student s = findbyEmail(email);
        if(s != null)
            STUDENT.remove(s);
    }

    public List<Student> getStudents() {
        return STUDENT;
    }
}

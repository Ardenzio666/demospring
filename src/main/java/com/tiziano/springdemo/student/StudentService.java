package com.tiziano.springdemo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {


    Student save(Student s);
    List<Student> findAllStudents();
    Student findByEmail(String email);
    void delete(String email);
    Student update(Student s);

}

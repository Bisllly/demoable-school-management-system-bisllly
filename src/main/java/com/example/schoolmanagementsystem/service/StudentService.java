package com.example.schoolmanagementsystem.service;

import com.example.schoolmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(String id);
    Student updateStudent(Student student);
    void deleteStudentById(String id);
}

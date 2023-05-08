package com.example.schoolmanagementsystem.service;

import com.example.schoolmanagementsystem.entity.Classroom;
import com.example.schoolmanagementsystem.entity.Student;
import com.example.schoolmanagementsystem.entity.Teacher;
import com.example.schoolmanagementsystem.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClassroomService {
    Classroom createClassroom (Teacher teacher, List<Student> students);
}

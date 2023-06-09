package com.example.schoolmanagementsystem.service;

import com.example.schoolmanagementsystem.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher saveTeacher(Teacher teacher);
    Teacher getTeacherById(String id);
    Teacher updateTeacher(Teacher teacher);
    void deleteTeacherById(String id);
}

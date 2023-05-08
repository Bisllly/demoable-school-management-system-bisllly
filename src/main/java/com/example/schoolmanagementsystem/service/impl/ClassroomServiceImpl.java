package com.example.schoolmanagementsystem.service.impl;

import com.example.schoolmanagementsystem.entity.Classroom;
import com.example.schoolmanagementsystem.entity.Student;
import com.example.schoolmanagementsystem.entity.Teacher;
import com.example.schoolmanagementsystem.repository.ClassroomRepository;
import com.example.schoolmanagementsystem.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    private ClassroomRepository classroomRepository;
    public ClassroomServiceImpl(ClassroomRepository classroomRepository) {
        super();
        this.classroomRepository = classroomRepository;
    }
    @Override
    public Classroom createClassroom(Teacher teacher, List<Student> students) {
        Classroom classroom = new Classroom();
        classroom.setTeacher(teacher);
        classroom.setStudents(students);
        return classroomRepository.save(classroom);
    }
}

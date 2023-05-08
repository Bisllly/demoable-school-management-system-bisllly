package com.example.schoolmanagementsystem.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "classrooms")
public class Classroom {
    @Id
    private String id;

    @DBRef
    private Teacher teacher;

    @DBRef
    private List<Student> students;

    // constructor, getters and setters

    public Classroom() {}

    public Classroom(Teacher teacher, List<Student> students) {
        super();
        this.teacher = teacher;
        this.students = students;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}


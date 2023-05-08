package com.example.schoolmanagementsystem.repository;

import com.example.schoolmanagementsystem.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}

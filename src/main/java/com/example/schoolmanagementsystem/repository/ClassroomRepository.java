package com.example.schoolmanagementsystem.repository;

import com.example.schoolmanagementsystem.entity.Classroom;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassroomRepository extends MongoRepository<Classroom, String> {

}

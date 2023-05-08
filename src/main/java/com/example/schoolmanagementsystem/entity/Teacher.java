package com.example.schoolmanagementsystem.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "teachers")
public class Teacher{
    @Id
//    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private String id;

//    @Column( name = "first_name", nullable = false)
    private String firstName;

//    @Column( name = "last_name")
    private String lastName;

//    @Column ( name = "email")
    private String email;

    public Teacher() {}

    public Teacher(String firstName, String lastName, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

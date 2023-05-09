package com.example.studentsims.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String fName;
    @Column(name = "last_name", nullable = false)
    private String sName;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "reg_number", nullable = false)
    private String regNumber;


    public Student(String fName, String sName, String email, String regNumber) {
        this.fName = fName;
        this.sName = sName;
        this.email = email;
        this.regNumber = regNumber;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
}

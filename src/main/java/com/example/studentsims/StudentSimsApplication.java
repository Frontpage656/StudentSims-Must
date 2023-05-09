package com.example.studentsims;

import com.example.studentsims.Entity.Student;
import com.example.studentsims.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentSimsApplication {

    public static void main(String[] args){
        SpringApplication.run(StudentSimsApplication.class, args);
    }

//    @Autowired
//    private StudentRepository studentRepository;
//    @Override
//    public void run(String... args) throws Exception {
//        Student student1 = new Student("Anneth","Johnson","anneth02@gmail.com","5845845582");
//        studentRepository.save(student1);
//        Student student2 = new Student("Sitta","Ngwesa","gwesa@gmail.com","84584095845");
//        studentRepository.save(student2);
//        Student student3 = new Student("Shio","Masawe","masawee@gmail.com","854848584234");
//        studentRepository.save(student3);
//    }

}

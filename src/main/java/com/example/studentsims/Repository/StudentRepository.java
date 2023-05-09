package com.example.studentsims.Repository;

import com.example.studentsims.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

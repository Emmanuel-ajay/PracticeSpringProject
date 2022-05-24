package com.example.SpringProject.Repository;

import com.example.SpringProject.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {
   // Optional<Student> findstudentbyemail (String email);
  // List<Student> findStudentBySchoolsId (Long schoolId);
}

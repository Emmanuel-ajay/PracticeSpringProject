package com.example.SpringProject.Repository;

import com.example.SpringProject.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School,Long> {
//List<School> findSchoolsByStudentId(Long studentId);
}

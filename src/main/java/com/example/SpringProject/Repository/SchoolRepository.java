package com.example.SpringProject.Repository;

import com.example.SpringProject.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Long> {
}

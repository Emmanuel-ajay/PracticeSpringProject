package com.example.SpringProject.Service;

import com.example.SpringProject.Entity.School;
import com.example.SpringProject.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service

public class SchoolService {
    private final SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public List<School> getSchools (){
        return  schoolRepository.findAll();
    }
    public School saveSchool(School school){
        return schoolRepository.save(school);
    }


}

package com.example.SpringProject.Controller;

import com.example.SpringProject.Dto.HomeDto;
import com.example.SpringProject.Dto.SchoolDto;
import com.example.SpringProject.Entity.Home;
import com.example.SpringProject.Entity.School;
import com.example.SpringProject.Service.SchoolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/school")
public class SchoolController {
    private final SchoolService schoolservice;

    @Autowired
    private ModelMapper modelMapper;
    public SchoolController(SchoolService schoolservice) {
        this.schoolservice = schoolservice;
    }

    @GetMapping
    public List<School> getSchools(){
        return schoolservice.getSchools();

    }
    @PostMapping
    public School saveSchool(@Valid @RequestBody SchoolDto schoolRequest){
        // map home request of type schoolDto to school entity
        System.out.println(schoolRequest);
        School  homeObject = modelMapper.map(schoolRequest,School.class);
        return  schoolservice.saveSchool(homeObject);
    }


}

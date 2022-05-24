package com.example.SpringProject.Dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Student_SchoolDto {
    private Long id;
    @NotNull

    private Long student_id;
    @NotNull
    private Long school_id;

    public Student_SchoolDto(){}

    public Student_SchoolDto(Long id, Long student_id, Long school_id){
        this.id = id;
        this.student_id= student_id;
        this.school_id = school_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getSchool_id() {
        return school_id;
    }

    public void setSchool_id(Long school_id) {
        this.school_id = school_id;
    }
}



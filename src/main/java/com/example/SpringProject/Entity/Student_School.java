package com.example.SpringProject.Entity;

import javax.persistence.*;

@Entity
@Table
public class Student_School {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_school_sequence"
    )
    private Long id;
    private Long student_id;
    private Long school_id;

    public Student_School(){}

    public Student_School(Long id, Long student_id, Long school_id){
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

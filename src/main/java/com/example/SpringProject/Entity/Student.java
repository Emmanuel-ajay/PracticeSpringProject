package com.example.SpringProject.Entity;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "student_id")
    private Long id;
    private String name;
    private String email;




    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "student_school",
            joinColumns = @JoinColumn(name = "student_id",nullable = false, updatable = false),
            inverseJoinColumns = @JoinColumn(name = "school_id",nullable = false, updatable = false)
    )
    List<School> attends = new ArrayList<>();
    public List<School> getSchools(){
        return this.attends;
    }
//    public void setAttends(List<School> attends){
//        this.attends = attends;
//    }


    public Student (){}

    public Student(Long id,
                   String name,
                   LocalDate dob,

                   String email) {
        this.id = id;
        this.name = name;


        this.email = email;
    }
    public Student (String name, String email ){
        this.name = name;
        this.email = email;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

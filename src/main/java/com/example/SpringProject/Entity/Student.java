package com.example.SpringProject.Entity;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private Long id;
    private String name;
    private String email;




    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id", referencedColumnName = "Student_id")
    private School school;
    public School getSchool(){
        return school;
    }


    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id", referencedColumnName = "Student_id")
    private Home home;
    public Home getHome(){
        return home;
    }
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

package com.example.SpringProject.Entity;

import javax.persistence.*;

@Entity
@Table
public class Home {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "home_sequence"
    )
    private Long id;
    private Long student_id;
    private String name;
    private String country;
    private String address;
    private String type;
    @ManyToOne
    @JoinColumn(name="student_id", nullable=false,insertable = false,updatable = false)
    private Student student;





    public Home(){}


    public Home(Long student_id, String name, String country, String address,  String type) {
        this.student_id = student_id;
        this.name = name;
        this.country = country;
        this.address = address;
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", country=" + country +
                ", address='" + address + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

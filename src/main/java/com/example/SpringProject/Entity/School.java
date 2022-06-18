package com.example.SpringProject.Entity;


import javax.persistence.*;

@Entity
@Table
public class School {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "school_sequence"
    )
    private Long id;
    private Long student_id;
    private String name;
    private String country;
    private String address;
    private String email;


    @OneToOne
    @JoinColumn(name="student_id", nullable=false,insertable = false,updatable = false)
    private Student student;


    public School(){

    }
    public School(Long student_id, String name, String country, String address, String email) {

        this.student_id = student_id;
        this.name = name;
        this.country = country;
        this.address = address;
        this.email = email;
    }
    public School(String name , String address,String country, String email){
        this.name = name;
        this.country = country;
        this.address = address;
        this.email = email;

    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + student_id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", address=" + address+
                ", email='" + email + '\'' +
                '}';
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}



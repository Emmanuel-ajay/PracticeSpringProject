package com.example.SpringProject.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class School {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "school_sequence"
    )
    @Column(name = "school_id")
    private Long id;
    private String name;
    private String country;
    private String address;
    private String email;


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },mappedBy = "attends")
   private List<Student> student = new ArrayList<>();



    public School(){

    }
    public School(Long id,Long student_id, String name, String country, String address, String email) {
        this.id =id;

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
                ", name='" + name + '\'' +
                ", country=" + country +
                ", address=" + address+
                ", email='" + email + '\'' +
                '}';
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}



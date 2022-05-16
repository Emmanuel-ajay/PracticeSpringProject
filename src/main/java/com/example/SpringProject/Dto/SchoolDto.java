package com.example.SpringProject.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class SchoolDto {
    private Long id;
    private Long student_id;
    @NotNull
    private String name;
    @NotNull
    private String country;
    @NotNull
    private String address;
    @NotNull
    private String email;


    public SchoolDto(){

    }
    public SchoolDto(Long id,Long student_id, String name, String country, String address, String email) {

        this.id = id;
        this.student_id = student_id;
        this.name = name;
        this.country = country;
        this.address = address;
        this.email = email;
    }
    public SchoolDto(String name , String address,String country, String email){
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

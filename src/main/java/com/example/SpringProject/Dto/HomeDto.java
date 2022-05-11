package com.example.SpringProject.Dto;

import javax.validation.constraints.NotNull;

public class HomeDto {
    private Long id;
    private Long student_id;
    @NotNull(message = "name can't be empty")
    private String name;
    @NotNull(message = "Country can't be empty")
    private String country;
    @NotNull(message = "address can't be empty")
    private String address;
    @NotNull(message = "type can't be empty")
    private String type;

    public HomeDto(Long student_id, String name, String country, String address, String email, String type) {
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
}



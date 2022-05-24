package com.example.SpringProject.Dto;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.Period;

public class StudentDto {
        private Long id;
        @NotNull(message = "name can't be empty")
        @Size(min = 3, max = 15, message = "Name should be  between 3-15 characters")

        private String name;

        @NotNull(message = "email can't be empty")
        @Email(message = "Email has to be in correct format")
        private String email;

        public StudentDto() {
        }

        public StudentDto(Long id,
                       String name,


                       String email) {
            this.id = id;
            this.name = name;


            this.email = email;
        }

        public StudentDto(String name,


                       String email) {
            this.name = name;

            this.email = email;
        }
        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }



        public void setEmail(String email) {
            this.email = email;
        }
    }



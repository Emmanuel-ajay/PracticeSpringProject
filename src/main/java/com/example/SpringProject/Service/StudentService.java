package com.example.SpringProject.Service;

import com.example.SpringProject.Dto.Student_SchoolDto;
import com.example.SpringProject.Entity.Student;
import com.example.SpringProject.Entity.Student_School;
import com.example.SpringProject.Repository.StudentRepository;
import com.example.SpringProject.Repository.Student_SchoolRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {
    private final Student_SchoolRepository student_schoolRepository;


    private final StudentRepository studentRepository;

    public StudentService(Student_SchoolRepository student_schoolRepository, StudentRepository studentRepository) {
        this.student_schoolRepository = student_schoolRepository;
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student addNewStudent(Student student) {
        return studentRepository.save(student);


    }
    public String assignStudentToSchool(Student_School studentData){

        try {
            student_schoolRepository.save(studentData);
            return "you've successfully assigned this student to a school";
        }
        catch (Exception e){
            return e.getMessage();
        }


    }

    public void deleteStudent(Long studentId) {
        Boolean exists = studentRepository.existsById(studentId);
        if (!exists){
            throw new IllegalStateException("Student with id " + studentId + "doesn't exist");
        }
        studentRepository.deleteById(studentId);
    }
    @Transactional
    public  void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("student with id" + studentId + "doesn't exist "));
        if( name != null &&
                name.length()> 0 &&
                !Objects.equals(student.getName(),name)){
            student.setName(name);
        }
        if( email != null &&
                email.length()> 0 &&
                !Objects.equals(student.getEmail(),email)){
           // Optional<Student> studentOptional = studentRepository.findstudentbyemail(email);
            //if(studentOptional.isPresent()){
             //   throw new IllegalStateException("email taken");
            }
            student.setName(email);
        }
    }


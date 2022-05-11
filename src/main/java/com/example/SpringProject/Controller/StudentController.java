package com.example.SpringProject.Controller;

import com.example.SpringProject.Dto.StudentDto;
import com.example.SpringProject.Entity.Student;
import com.example.SpringProject.Service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    private ModelMapper modelMapper;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @PostMapping
    public Student addNewStudent (@RequestBody @Valid StudentDto studentDto){
        Student student = modelMapper.map(studentDto,Student.class);

        return studentService.addNewStudent(student);
    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent (@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);


    }

    @PutMapping(path = "{studentId}")
    public void updateStudent( @Valid
                               @PathVariable("studentId") Long studentId,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) String email) {
        studentService.updateStudent (studentId, name, email);
    }



}

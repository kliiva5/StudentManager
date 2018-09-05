package com.example.school.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{

    @Autowired private StudentDataService studentDataService;

    @GetMapping(value = "/students/{studentId}", produces = "application/json")
    public Student getSingleStudent( @PathVariable String studentId )
    {
        return studentDataService.getSingleStudentByStudentId( studentId );
    }

    @GetMapping(value = "/students", produces = "application/json")
    public List<Student> getAllStudents()
    {
        return studentDataService.getAllStudents();
    }

    @PostMapping(value = "/students/{studentId}/profile")
    public Student updateStudentCourses( @RequestParam List<Course> courses, @PathVariable String studentId )
    {
        return studentDataService.saveStudentCourses( courses, studentId );
    }

}

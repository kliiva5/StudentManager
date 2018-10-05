package com.example.school.demo.service;

import com.example.school.demo.Course;
import com.example.school.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDataService
{
    @Autowired
    private SqlService sqlService;

    public Student getSingleStudentByStudentId( String studentId )
    {
        return sqlService.getStudentById( studentId );
    }

    public List<Student> getAllStudents()
    {
        return sqlService.getStudents();
    }

    public Student saveStudentCourses( List<Course> courses, String studentId )
    {
        return sqlService.saveCourses( courses, studentId );
    }
}

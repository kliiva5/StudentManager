package com.example.school.demo.service;

import com.example.school.demo.Course;
import com.example.school.demo.Student;

import java.util.List;

public interface SqlService
{
    Student getStudentById( String studentId );

    List<Student> getStudents();

    Student saveCourses( List<Course> courses, String studentId );
}

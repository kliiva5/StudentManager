package com.example.school.demo.service;

import com.example.school.demo.Course;
import com.example.school.demo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SqlServiceImpl implements SqlService
{
    @Override
    public Student getStudentById( String studentId )
    {
        return null;
    }

    @Override
    public List<Student> getStudents()
    {
        return null;
    }

    @Override
    public Student saveCourses( List<Course> courses, String studentId )
    {
        return null;
    }
}

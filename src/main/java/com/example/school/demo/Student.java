package com.example.school.demo;

import lombok.Data;

import java.util.List;

@Data
public class Student
{
    private String firstName;

    private String lastName;

    private List<Course> courses;

    private List<Grade> grades;
}

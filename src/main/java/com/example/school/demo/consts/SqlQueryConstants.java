package com.example.school.demo.consts;

public class SqlQueryConstants
{
    public static final String RETRIEVE_ALL_STUDENTS_QUERY = "SELECT * FROM Students";

    public static final String RETRIEVE_SINGLE_STUDENT_BY_ID_QUERY = "SELECT Student s FROM Students WHERE s.id = {}";

    public static final String UPDATE_SINGLE_STUDENT_COURSES_QUERY = "UPDATE Student s SET s.courses = {} WHERE s.id = {}";
}

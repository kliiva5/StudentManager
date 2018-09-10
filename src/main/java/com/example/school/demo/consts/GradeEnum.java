package com.example.school.demo.consts;

import lombok.Getter;

@Getter
public enum GradeEnum
{
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F");

    private String gradeName;

    GradeEnum( String gradeName ) {
        this.gradeName = gradeName;
    }
}

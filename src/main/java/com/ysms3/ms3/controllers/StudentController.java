package com.ysms3.ms3.controllers;

import org.springframework.graphql.data.method.annotation.Argument;
import com.ysms3.ms3.models.*;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
class StudentController {

    @QueryMapping
    public Student studentById(@Argument String id) {
        return Student.getById(id);
    }

    @QueryMapping
    public List<Student> students() {
        return Student.findALl();
    }

    @QueryMapping
    public List<Student> studentsByKeyword(@Argument String keyword) {
        return Student.search(keyword);
    }



}
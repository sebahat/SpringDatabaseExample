package com.backend.backend.controller;

import com.backend.backend.dto.Courses;
import com.backend.backend.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    CourseService courseSerivce;

    @PostMapping(path = "/addCourse")
    public void addConstructor(@RequestBody Courses course) {
        courseSerivce.addCourse(course);
    }

}

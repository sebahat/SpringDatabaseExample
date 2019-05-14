package com.backend.backend.controller;

import com.backend.backend.model.Courses;
import com.backend.backend.service.CourseService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @Autowired
    CourseService courseSerivce;

    @PostMapping(path = "/addCourse")
    public void addConstructor(@RequestBody Courses course) {
        courseSerivce.addCourse(course);
    }

    @PostMapping(path = "/updateCourse")
    public void updateCourse(@RequestBody String requestBody) {
        JSONObject requestBodyObj = new JSONObject(requestBody);
        Integer courseId = requestBodyObj.getInt("courseId");
        String courseTitle = requestBodyObj.getString("title");
        courseSerivce.updateCourse(courseId, courseTitle);
    }

    @GetMapping(path = "/getCourse/{courseId}")
    public Courses getCourse(@PathVariable Integer courseId) {
        return courseSerivce.getCourse(courseId);
    }
}

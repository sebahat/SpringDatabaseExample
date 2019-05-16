package com.backend.backend.controller;


import com.backend.backend.model.InsructorDetail;
import com.backend.backend.model.Instructor;
import com.backend.backend.service.InstructorDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InstructorDetailController {
    @Autowired
    InstructorDetailService detailService;

    @GetMapping(path = "/getInstructorDetailById/{instructorDetailId}")
    public InsructorDetail getInstructorDetail(@PathVariable Integer instructorDetailId) {
        return detailService.getInstructorDetail(instructorDetailId);
    }

    @PostMapping(path = "/saveInstructorDetail")
    public void saveInstructorDetail(InsructorDetail detail) {
        detailService.saveInstructorDetail(detail);
    }

    @GetMapping(path = "/getInsDetailInstuctor")
    public Instructor getInstructor(@PathVariable  Integer instructorDetialId) {
        return detailService.getInstructor(instructorDetialId);
    }


}

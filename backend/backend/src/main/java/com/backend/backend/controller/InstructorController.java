package com.backend.backend.controller;

import com.backend.backend.dto.InsructorDetail;
import com.backend.backend.dto.Instructor;
import com.backend.backend.service.InstructorService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstructorController {

    @Autowired
    InstructorService instructorService;

    @GetMapping(path = "/getInstructor")
    public List<Instructor> getInstructors() {
        return instructorService.getInstructors();
    }

    @PostMapping(path = "/saveInstructor")
    public void saveInstructor(@RequestBody Instructor instructor) {
        instructorService.saveInstructor(instructor);
    }

    @GetMapping(path = "/getInstructorDetail/{instructorId}")
    public InsructorDetail getInstructorDetail(@PathVariable Integer instructorId) {
        if (instructorService.getInstructorDetail(instructorId) == null) {
            return null;
        } else {
            return instructorService.getInstructorDetail(instructorId);
        }
    }


    @PostMapping(path = "/addInstrInstructorDetail")
    public InsructorDetail addInstrInstructorDetail(@RequestBody String requestAddBody) {
        JSONObject requestBody = new JSONObject(requestAddBody);
        Integer intructor_id = requestBody.getInt("instructor_id");
        JSONObject instructor_detail_obj = requestBody.getJSONObject("instructor_detail");
        InsructorDetail detail = new InsructorDetail(instructor_detail_obj.getString("youtubeChannel"), instructor_detail_obj.getString("hobby"));
        return instructorService.addInstrInstructorDetail(intructor_id, detail);
    }
}

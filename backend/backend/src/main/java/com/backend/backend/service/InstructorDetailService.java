package com.backend.backend.service;

import com.backend.backend.dao.InstructorDetailDao;
import com.backend.backend.dto.InsructorDetail;
import com.backend.backend.dto.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorDetailService {
    @Autowired
    InstructorDetailDao instructorDetail;

    public InsructorDetail getInstructorDetail(Integer instructorDetailId) {
        return instructorDetail.getInstructorDetail(instructorDetailId);
    }

    public void saveInstructorDetail(InsructorDetail detail) {
        instructorDetail.saveInstructorDetail(detail);
    }

    public Instructor getInstructor(Integer instructorDetailId) {
        return instructorDetail.getInstructor(instructorDetailId);
    }

}

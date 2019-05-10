package com.backend.backend.dao;

import com.backend.backend.dto.InsructorDetail;
import com.backend.backend.dto.Instructor;

import java.util.List;

public interface InstructorDetailDao {


    public InsructorDetail getInstructorDetail(Integer instuctorDetailId);

    public void saveInstructorDetail(InsructorDetail detail);

    public InsructorDetail instructorDetailUpdate();

    public Instructor getInstructor(Integer instructorDetailId);

}

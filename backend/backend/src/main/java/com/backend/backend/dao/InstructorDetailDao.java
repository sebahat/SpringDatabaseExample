package com.backend.backend.dao;

import com.backend.backend.model.InsructorDetail;
import com.backend.backend.model.Instructor;

public interface InstructorDetailDao {


    InsructorDetail getInstructorDetail(Integer instuctorDetailId);

    void saveInstructorDetail(InsructorDetail detail);

    InsructorDetail instructorDetailUpdate();

    Instructor getInstructor(Integer instructorDetailId);

}

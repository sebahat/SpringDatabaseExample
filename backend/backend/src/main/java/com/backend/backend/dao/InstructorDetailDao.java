package com.backend.backend.dao;

import com.backend.backend.dto.InsructorDetail;

import java.util.List;

public interface InstructorDetailDao {



    public List<InsructorDetail> getInstructorDetail();

    public InsructorDetail saveInstructorDetail();


}

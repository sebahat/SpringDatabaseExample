package com.backend.backend.dao;

import com.backend.backend.dto.InsructorDetail;
import com.backend.backend.dto.Instructor;

import java.util.List;

public interface InstructorDao {

    public List<Instructor> getInstructors();

    public void saveInstructor(Instructor instructor);

    public Instructor getCourses();


    public Instructor getInstructor(Integer id);

    public InsructorDetail getInstructorDetail(Integer instructorId);

    public InsructorDetail addInstrInstructorDetail(Integer instructorId, InsructorDetail instructorDetail);


}

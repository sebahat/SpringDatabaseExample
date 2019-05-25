package com.backend.backend.dao;

import com.backend.backend.model.InsructorDetail;
import com.backend.backend.model.Instructor;

import java.util.List;

public interface InstructorDao {

    List<Instructor> getInstructors();

    void saveInstructor(Instructor instructor);

    Instructor getCourses();

    Instructor getInstructor(Integer id);

    InsructorDetail getInstructorDetail(Integer instructorId);

    InsructorDetail addInstrInstructorDetail(Integer instructorId, InsructorDetail instructorDetail);


}

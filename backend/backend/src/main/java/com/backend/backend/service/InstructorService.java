package com.backend.backend.service;

import com.backend.backend.dao.InstructorDao;
import com.backend.backend.model.InsructorDetail;
import com.backend.backend.model.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {
    @Autowired
    private InstructorDao instructorDao;

    public List<Instructor> getInstructors() {
        return instructorDao.getInstructors();
    }

    public void saveInstructor(Instructor instructor) {
        instructorDao.saveInstructor(instructor);
    }

    public InsructorDetail getInstructorDetail(Integer id) {
        return instructorDao.getInstructorDetail(id);
    }

    public Instructor getInstructor(Integer id) {
        return instructorDao.getInstructor(id);
    }

    public InsructorDetail addInstrInstructorDetail(Integer instructorId, InsructorDetail detail) {
        return instructorDao.addInstrInstructorDetail(instructorId, detail);
    }

}

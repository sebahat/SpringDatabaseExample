package com.backend.backend.daoImpl;

import com.backend.backend.dao.InstructorDao;
import com.backend.backend.model.InsructorDetail;
import com.backend.backend.model.Instructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class InstructorDaoImpl implements InstructorDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public @ResponseBody
    List<Instructor> getInstructors() {
        String sql = "FROM Instructor";
        return entityManager.createQuery(sql).getResultList();
    }

    @Override
    public void saveInstructor(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor getCourses() {
        return null;
    }

    @Override
    public InsructorDetail getInstructorDetail(Integer instructorId) {
        InsructorDetail detail = this.getInstructor(instructorId).getInstructorDetail();
        return detail;
    }

    @Override
    public InsructorDetail addInstrInstructorDetail(Integer instructorId, InsructorDetail instructorDetail) {
        Instructor inst = this.getInstructor(instructorId);
        inst.setInstructorDetail(instructorDetail);
        entityManager.flush();
        return this.getInstructor(instructorId).getInstructorDetail();
    }


    @Override
    public Instructor getInstructor(Integer id) {
        return entityManager.find(Instructor.class, id);
    }
}

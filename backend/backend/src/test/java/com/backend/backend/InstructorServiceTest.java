package com.backend.backend;


import com.backend.backend.daoImpl.InstructorDaoImpl;
import com.backend.backend.model.Instructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorServiceTest {
    @Autowired
    InstructorDaoImpl dao;

    //TODO ADD TEST SCRİPT THEN TESTİNG 09.05.2019

    @Test
    public void test() {
        int id = 112;
        try {
            Instructor ins= dao.getInstructor(4);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}

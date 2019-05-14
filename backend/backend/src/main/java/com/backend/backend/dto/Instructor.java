package com.backend.backend.dto;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "instructor", schema = "backend")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String fistName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_detail_id")
    @JsonBackReference
    private InsructorDetail instructorDetail;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "instructor", cascade =
            {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Courses> courses;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InsructorDetail getInstructorDetail() {
        return instructorDetail;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public void setInstructorDetail(InsructorDetail instructorDetail) {
        this.instructorDetail = instructorDetail;
    }

    public Instructor() {
    }

    public Instructor(String fistName, String lastName, String email) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
    }
    public void add(Courses tempCourse) {
        if (courses == null) {
            courses = new ArrayList<>();
        }
        courses.add(tempCourse);
        tempCourse.setInstructor(this);
    }


    @Override
    public String toString() {
        return "Instructor{" + "id=" + id + ", fistName='" + fistName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", instructorDetail=" + instructorDetail + '}';
    }
}

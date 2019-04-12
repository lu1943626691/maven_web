package com.baizhi.service;

import com.baizhi.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> selectAll();

    public void delete(int ids[]);

    public void update(Student student);

}

package com.baizhi.dao;

import com.baizhi.entity.Student;

import java.util.List;

public interface StudentDao {
    //注水
    public List<Student> selectAll();

    public void delete(int ids[]);

    public void update(Student student);
}

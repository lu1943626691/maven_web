package com.baizhi.dao;

import com.baizhi.entity.Student;

import java.util.List;

public interface StudentDao {
    //注水
    public List<Student> selectAll();
//test2
    public void delete(int ids[]);
//test3
    public void update(Student student);
}

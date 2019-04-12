package com.baizhi.entity;

public class Student {
    private Integer stu_id;// number primary key,
    private String stu_name;//varchar2(20),
    private Integer stu_age;// number,
    private Integer stu_gender;//number,--0是女
    private Integer id_Delete;//

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public void setStu_age(Integer stu_age) {
        this.stu_age = stu_age;
    }

    public Integer getStu_gender() {
        return stu_gender;
    }

    public void setStu_gender(Integer stu_gender) {
        this.stu_gender = stu_gender;
    }

    public Integer getId_Delete() {
        return id_Delete;
    }

    public void setId_Delete(Integer id_Delete) {
        this.id_Delete = id_Delete;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", stu_gender=" + stu_gender +
                ", id_Delete=" + id_Delete +
                '}';
    }
}

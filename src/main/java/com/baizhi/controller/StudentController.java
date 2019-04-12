package com.baizhi.controller;

import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("selectAll")
    public String select(ModelMap map) {
        System.out.println("开始");
        List<Student> list = studentService.selectAll();
        map.addAttribute("list", list);

        return "forward:/index.jsp";
    }

}

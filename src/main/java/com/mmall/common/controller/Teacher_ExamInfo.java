package com.mmall.common.controller;

import com.mmall.service.StudentService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/5/8.
 */
@Controller
@RequestMapping("/teacher")
public class Teacher_ExamInfo {

    private StudentService studentService;

    @RequestMapping("/info")
    public String see() throws Exception {
        Long num = studentService.getLogin();
        System.out.println(num);
       return  null;
    };

    @RequestMapping("/info")
    public String seeInfo() throws Exception {
        Long num = studentService.getLogin();
        System.out.println(num);
        return  null;
    };







}

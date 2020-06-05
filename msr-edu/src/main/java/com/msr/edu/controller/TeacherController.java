package com.msr.edu.controller;


import com.msr.edu.entity.Teacher;
import com.msr.edu.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author tom
 * @since 2020-06-05
 */
@Api(description="讲师管理")
@RestController
@RequestMapping("/edu/teacher")
@CrossOrigin
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "所有讲师列表")

    @GetMapping
    public List<Teacher> list(){
        return teacherService.list(null);
    }

}


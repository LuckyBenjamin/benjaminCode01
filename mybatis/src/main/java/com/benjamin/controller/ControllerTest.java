package com.benjamin.controller;

import com.benjamin.models.po.User;
import com.benjamin.test.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ControllerTest
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/1/7
 **/
@RestController
public class ControllerTest {

    @Autowired
    ServiceTest test;

    @RequestMapping("test")
    public List<User> getData(){
        return test.getDataTest();
    }
}

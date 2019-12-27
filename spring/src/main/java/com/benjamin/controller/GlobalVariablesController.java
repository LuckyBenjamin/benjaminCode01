package com.benjamin.controller;

import com.benjamin.service.GlobalVariablesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GlobalVariablesController
 * @Description: {spring中全局变量测试}
 * @Author Benjamin
 * @Date 2019/12/27
 **/
@Api("test")
@RestController
public class GlobalVariablesController {

    @Autowired
    private GlobalVariablesService service;

    @ApiOperation(value = "spring中全局变量测试",notes = "")
    @PostMapping(value = "/test")
    public String globalVariablesTest(){
        return service.test();
    }

    @ApiOperation(value = "spring中全局变量测试",notes = "")
    @PostMapping(value = "/test2")
    public String globalVariablesTest2(){
        return service.test2();
    }

}

package com.benjamin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Controller
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/1/2
 **/
@RestController
public class ControllerTest {

    @Autowired
    private FeignService feignService;

    @GetMapping("test")
    public String userAuth(String ticket){
        return feignService.ssoCheck(ticket);
    }
}

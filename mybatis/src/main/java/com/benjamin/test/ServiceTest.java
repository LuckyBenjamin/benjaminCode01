package com.benjamin.test;

import com.benjamin.mapper.UserMapper;
import com.benjamin.models.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ServiceTest
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/1/7
 **/
@Service
public class ServiceTest {

    @Autowired
    UserMapper userMapper;

    public List<User> getDataTest(){
        List<User> users = userMapper.selectByExample(null);
        users.forEach((user -> System.out.println(user)));
        return users;
    }
}

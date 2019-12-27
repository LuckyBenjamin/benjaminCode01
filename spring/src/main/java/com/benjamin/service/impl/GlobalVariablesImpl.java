package com.benjamin.service.impl;

import com.benjamin.common.utils.QiNiuConfig;
import com.benjamin.service.GlobalVariablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName GlobalVariablesImpl
 * @Description: {}
 * @Author Benjamin
 * @Date 2019/12/27
 **/
@Service
public class GlobalVariablesImpl implements GlobalVariablesService {

    @Autowired
    private QiNiuConfig qiNiuConfig;
    //这样写会引起空指针
    //String str = qiNiuConfig.getDomain();


    @Override
    public String test() {
        return "你好！！！";
    }

    @Override
    public String test2() {
        return qiNiuConfig.getDomain()+"dddddddddddddd";
    }
}

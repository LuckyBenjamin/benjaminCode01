package com.benjamin.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @InterfaceName FeignService
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/1/2
 */
//完整url=https://test.cn/user/auth?token=
//然后再自己控制器里面调用此接口就完成了
@FeignClient(name = "test", url = "http://58.33.21.20:9966/e3_lsy/e3_master")
public interface FeignService {
    @RequestMapping(method = RequestMethod.POST, value = "/webopm/web",consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    String ssoCheck(String token);
}

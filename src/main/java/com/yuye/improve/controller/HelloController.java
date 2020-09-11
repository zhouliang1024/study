package com.yuye.improve.controller;

import com.alibaba.fastjson.JSON;
import com.yuye.improve.DO.UserDO;
import com.yuye.improve.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhouliang
 * @Date: 2020/9/10 23:21
 */
@RestController
@RequestMapping("/RainyNight")
public class HelloController {
    @Autowired
    private UserService userService;
    @PostMapping("/hello")
    public String sayHello(@RequestBody UserDO userDO){
        System.out.println("hello!world"+userDO.getUser_id());
        UserDO u = userService.getUserName(userDO.getUser_id());
        return JSON.toJSONString(u);
    }
}

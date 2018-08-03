package com.icourt.clouddemoclienta.controller;

import com.icourt.common.entity.BaseUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试服务提供者
 *
 * @author jianglu
 * Created 2018 - 08 - 03 - TIME
 */

@RestController
@RequestMapping("/api/v1")
public class DemoController {


    @GetMapping("/user")
    public ResponseEntity<BaseUser> user(){
        BaseUser baseUser = new BaseUser();
        baseUser.setPassword("123456");
        baseUser.setUsername("张三");
        baseUser.setUserId(1);
        return ResponseEntity.ok(baseUser);
    }
}

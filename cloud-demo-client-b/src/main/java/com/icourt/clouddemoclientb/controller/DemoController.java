package com.icourt.clouddemoclientb.controller;

import com.icourt.clouddemoclientb.service.FindService;
import com.icourt.common.entity.BaseUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 服务b的demo
 *
 * @author jianglu
 * Created 2018 - 08 - 03 - TIME
 */
@RestController
public class DemoController {

    @Resource
    FindService findService;


    @GetMapping("/index")
    public ResponseEntity<BaseUser> getUserByB(){
        return findService.getBaseUser();
    }

}

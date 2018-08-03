package com.icourt.clouddemoclientb.controller;

import com.icourt.common.entity.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 服务b的demo
 *
 * @author jianglu
 * Created 2018 - 08 - 03 - TIME
 */
@RestController
public class DemoController {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/index")
    public BaseUser getUserByB(){
        return restTemplate().getForObject("http://localhost:2222/api/v1/user/",BaseUser.class);
    }

}

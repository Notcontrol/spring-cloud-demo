package com.icourt.clouddemoclientb.service;


import com.icourt.common.entity.BaseUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("cloud-client-a")
public interface FindService {

    @RequestMapping("/api/v1/user/")
    ResponseEntity<BaseUser> getBaseUser();
}

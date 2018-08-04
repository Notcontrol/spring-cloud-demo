package com.icourt.clouddemoclientb.hystric;

import com.icourt.clouddemoclientb.service.FindService;
import com.icourt.common.entity.BaseUser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * 断路器
 *
 * @author jianglu
 * Created 2018 - 08 - 04 - TIME
 */
@Component
public class SchedualServiceHiHystrix implements FindService {
    @Override
    public ResponseEntity<BaseUser> getBaseUser() {

        BaseUser baseUser = new BaseUser();
        baseUser.setUserId(1);
        baseUser.setUsername("wangxiaowu");
        baseUser.setPassword("wang");
        return ResponseEntity.ok(baseUser);
    }
}

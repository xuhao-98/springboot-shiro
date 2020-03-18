package com.xuhao;

import com.xuhao.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootShiroApplicationTests {
@Autowired
    UserServiceImpl userService;
    @Test
    void contextLoads() {
        System.out.println(userService.selectUserByName("yoyo"));
    }

}

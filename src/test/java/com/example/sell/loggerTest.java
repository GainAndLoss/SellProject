package com.example.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j //利用此注解可以代替创建logger对象
public class loggerTest {
//    private final Logger logger = LoggerFactory.getLogger(loggerTest.class);
    @Test
    public void test1(){
        String code = "app01";
        String msg = "打印日志";
        log.info("info...");
//        log.error("error...");
        log.debug("debug...");
        log.info("code: {},message: {}",code,msg);
    }
}

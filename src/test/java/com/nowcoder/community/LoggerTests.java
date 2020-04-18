package com.nowcoder.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.runtime.Log;

/**
 * @Author: weigu
 * @Date: 2020/4/18 22:19
 * @Version: 1.0
 * @Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class LoggerTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerTests.class);

    @Test
    public void testLogger(){
        System.out.println(LOGGER.getName());

        LOGGER.debug("debug Log");
        LOGGER.info("info Log");
        LOGGER.warn("warn Log");
        LOGGER.error("error Log");
    }



}

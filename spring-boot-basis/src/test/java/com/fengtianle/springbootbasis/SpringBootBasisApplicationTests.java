package com.fengtianle.springbootbasis;

import com.fengtianle.SpringBootBasisApplication;
import com.fengtianle.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBasisApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringBootBasisApplication.class);

    @Autowired
    Student student;

    @Test
    public void contextLoads() {
        System.out.print(student);
    }

    @Test
    public void testLog() {
        logger.trace("trace*******");
        logger.debug("debug******");
        logger.info("info*******");
        logger.error("error******");
    }

}

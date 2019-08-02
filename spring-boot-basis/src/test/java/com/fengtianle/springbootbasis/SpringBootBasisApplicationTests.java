package com.fengtianle.springbootbasis;

import com.fengtianle.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBasisApplicationTests {

    @Autowired
    Student student;

    @Test
    public void contextLoads() {
        System.out.print(student);
    }

}

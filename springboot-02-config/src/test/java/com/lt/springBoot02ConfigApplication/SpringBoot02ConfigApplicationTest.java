package com.lt.springBoot02ConfigApplication;


import com.lt.springboot.SpringBoot02ConfigApplication;
import com.lt.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 *  可以在测试期间很方便的类似编码一样自动注入等容器的
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBoot02ConfigApplication.class)
public class SpringBoot02ConfigApplicationTest {

    @Autowired
    ApplicationContext ioc;

    @Autowired
    Person person;


    @Test
    public void contextLoads(){

//        Person bean = ioc.getBean(Person.class);
        System.out.println(person);
    }

}

package com.rong.mapper;

import com.rong.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by wh on 2017/8/25.
 */
public class UserMapperTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws IOException {
        applicationContext=new ClassPathXmlApplicationContext("spring/spring.xml");
    }
    @Test

    public void test(){
        UserMapper userMapper= (UserMapper) applicationContext.getBean("userMapper");
        User user= userMapper.findUserById(1);
        System.out.println(user);
    }

}
package com.rong.mapper;

import com.rong.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by wh on 2017/8/25.
 */
public class UserMapperTest {

    private SqlSessionFactory sessionFactory;
    @Before
    public void setUp() throws IOException {
        String resource = "mybatis/mybatis.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
       sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test

    public void test(){
        SqlSession sqlSession= sessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user= userMapper.findUserById(1);

        System.out.println(user);
        sqlSession.close();
    }

}
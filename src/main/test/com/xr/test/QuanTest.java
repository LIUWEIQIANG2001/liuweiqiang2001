package com.xr.test;

import com.xr.dao.ClazzMapper;
import com.xr.dao.PermissMapper;
import com.xr.dao.UserMapper;
import com.xr.dao.UserrMapper;
import com.xr.entity.Clazz;
import com.xr.entity.Permission;
import com.xr.entity.Student;
import com.xr.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class QuanTest {

    private SqlSession sqlSession;

    @Before
    public void before() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //模具
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        //产品
        sqlSession = sqlSessionFactory.openSession();
    }

    @After
    public void after() throws Exception {
        sqlSession.close();
    }

    @Test
    public void test1() throws Exception {
     UserrMapper mapper = sqlSession.getMapper(UserrMapper.class);




        //单表添加
//        Permission per=new Permission();
//       per.setPermName("系统维护1");
//       per.setUrl("xitong.jsp");
//        int i = userMapper.addper(per);

        User user = new User();
        user.setUserName("232332");
        user.setPassword("123456");
        int id = mapper.addUserr(user);
        sqlSession.commit();
        System.out.println(id);


        sqlSession.commit();
        System.out.println(1234);


    }
}
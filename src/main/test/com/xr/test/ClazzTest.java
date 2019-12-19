package com.xr.test;

import com.xr.dao.ClazzMapper;
import com.xr.dao.UserMapper;
import com.xr.entity.Clazz;
import com.xr.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class ClazzTest {

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
        //询所有班级信息
        ClazzMapper clazzMapper = sqlSession.getMapper(ClazzMapper.class);
        List<Clazz> clazzList = clazzMapper.findClazzs();
        for (Clazz clazz : clazzList) {
            System.out.println(clazz);
            for (Student student : clazz.getStudentList()) {
                System.out.println("\t" + student);
            }
        }

    }
}
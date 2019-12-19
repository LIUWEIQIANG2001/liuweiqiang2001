package com.xr.test;

import com.xr.dao.UserMapper;
import com.xr.entity.Duo;
import com.xr.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.Null;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class UserTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {

    }

    @Test
    public void test1()throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获得UserMapper这个接口
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

      //单表添加
//        User user = new User();
//         user.setUserName("张三");
//        user.setPassword("123456");
//        int id = userMapper.addUser(user);
//        System.out.println(user.getUserID());
//        sqlSession.commit();

        //单表的条件查询
     //   User user = userMapper.getUser(5);
    //   System.out.println(user);

        //多表联查的条件查询
//        List<Duo> tiaoduo = userMapper.tiaoduo(101);
//               for (Duo user : tiaoduo) {
//             System.out.println(user);
//        }
//        System.out.println(123);

        //查询全部
//      List<User> users = userMapper.getUsers();
//       for (User user : users) {
//             System.out.println(user);
//        }

        //根据id查询,没有给id就查询全部
//        User user = new User();
//        //user.setUserID(22);
//        List<Map<String, Object>> maps = userMapper.selectUserById(user);
//        System.out.println(maps);

        //   动态sql，修改
     User user = new User();
       user.setUserName("56946");
      //  user.setPassword("123456");
     user.setUserID(22);
       userMapper.xiu(user);
      sqlSession.commit();
      System.out.println(1233);



        //多表联查
//        System.out.println(12443);
//         List<Duo> getduos = userMapper.getduos();
//       for (Duo users : getduos) {
//             System.out.println(users);
//        }


//          删除
//        User user = new User();
//        user.setUserID(6);
//        userMapper.delUser(user.getUserID());
//        sqlSession.commit();
//        System.out.println(123);

        //修改
//      User user = new User();
//        user.setUserName("5666");
//        user.setPassword("123456");
//        user.setUserID(2);
//        userMapper.updateUser(user);
//        sqlSession.commit();
//        System.out.println(1233);

        //count个数
//        int count = userMapper.count();
//        System.out.println(count);

        //模糊查询
//        List<Duo> mohu = userMapper.mohu("%10%");
//               for (Duo users : mohu) {
//             System.out.println(users);
//        }
//        System.out.println(1234);



    }
}
package com.xr.dao;

import com.xr.entity.Duo;
import com.xr.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;
import java.util.Map;

/**
 * User类Dao层的接口
 */
public interface UserMapper {
    //alt + enter 引入快捷键

    //添加
    @Insert("insert into T_USER(user_name, `password`) values(#{userName}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty="userID")
    int addUser(User user);

    //根据ID删除对象
    int delUser(Integer uid);

    //根据ID修改对象
    int updateUser(User user);

     //查询
    User getUser(Integer uid);

    //查询
    List<Duo> getduos();

      int  count();

    List<Duo>  mohu(String uid);

    List<Duo>  tiaoduo(Integer uid);
    //查询多个
    List<User> getUsers();

    List<Map<String,Object>> selectUserById(User uid);
      int  xiu(User uid);
}

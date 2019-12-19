package com.xr.service;

import com.xr.entity.User;

/**
 * User类Dao层的接口
 */
public interface UserService {
    //alt + enter 引入快捷键

    //添加
    int addUser(User user);

    //根据ID删除对象
    int delUser(Integer uid);


}

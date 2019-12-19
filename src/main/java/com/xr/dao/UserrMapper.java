package com.xr.dao;

import com.xr.entity.Permission;
import com.xr.entity.User;

public interface UserrMapper {
   // @Insert("insert into t_permission(perm_Name, `url`) values(#{permName}, #{url})")


    int addUserr(User user);

}

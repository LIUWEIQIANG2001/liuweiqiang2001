package com.xr.dao;

import com.xr.entity.Permission;
import com.xr.entity.User;
import org.apache.ibatis.annotations.Insert;

public interface PermissMapper {
   // @Insert("insert into t_permission(perm_Name, `url`) values(#{permName}, #{url})")
    int addper(Permission perm);

    int addUserr(User user);

}

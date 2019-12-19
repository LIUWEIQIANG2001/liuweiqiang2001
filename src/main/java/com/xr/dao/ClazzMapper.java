package com.xr.dao;

import com.xr.entity.Clazz;

import java.util.List;

/**
 * 操作Clazz班级类的接口：CRUD
 */
public interface ClazzMapper {

    /**
     * 查询所有班级信息
     */
    List<Clazz> findClazzs();

    /**
     * 查询单个班级信息
     */
    Clazz findClazz(Integer cid);


}

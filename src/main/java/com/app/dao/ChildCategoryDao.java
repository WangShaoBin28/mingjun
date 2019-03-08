package com.app.dao;

import com.app.entity.ChildCategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Package com.app.dao
 * @ClassName ChildCategoryDao
 * @Author shaobin.wang
 * @Date 2019/03/08 14:15
 * @Version 1.0
 * @Description:
 **/
@Repository
@Mapper
public interface ChildCategoryDao {
    void insert(ChildCategoryEntity childCategoryEntity);
}

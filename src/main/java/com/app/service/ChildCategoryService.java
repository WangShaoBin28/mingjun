package com.app.service;

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
public interface ChildCategoryService {

    void insert(ChildCategoryEntity childCategoryEntity);

}

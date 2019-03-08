package com.app.service;

import com.app.entity.ParentCategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Package com.app.dao
 * @ClassName ParentCategoryDao
 * @Author shaobin.wang
 * @Date 2019/03/08 14:15
 * @Version 1.0
 * @Description:
 **/
public interface ParentCategoryService {

    void insert(ParentCategoryEntity parent);
}

package com.app.dao;

import com.app.entity.CategoryDetailedEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package com.app.dao
 * @ClassName CategoryDetailedDao
 * @Author shaobin.wang
 * @Date 2019/03/08 14:14
 * @Version 1.0
 * @Description: Mydream!1
 **/
@Repository
@Mapper
public interface CategoryDetailedDao {
    void insert(CategoryDetailedEntity categoryDetailedEntity);

    List<CategoryDetailedEntity> select();
}

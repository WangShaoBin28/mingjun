package com.app.service.impl;

import com.app.dao.CategoryDetailedDao;
import com.app.entity.CategoryDetailedEntity;
import com.app.service.CategoryDetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Package com.app.service
 * @ClassName CategoryDetailedService
 * @Author shaobin.wang
 * @Date 2019/03/08 14:38
 * @Version 1.0
 * @Description:
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class CategoryDetailedServiceImpl implements CategoryDetailedService {

    @Autowired
   private CategoryDetailedDao categoryDetailedDao;

    @Override
    public void insert(CategoryDetailedEntity categoryDetailedEntity) {
        categoryDetailedDao.insert(categoryDetailedEntity);
    }
}

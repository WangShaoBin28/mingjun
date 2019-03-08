package com.app.service.impl;

import com.app.dao.ChildCategoryDao;
import com.app.entity.ChildCategoryEntity;
import com.app.service.ChildCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Package com.app.service.impl
 * @ClassName ChildCategoryServiceImpl
 * @Author shaobin.wang
 * @Date 2019/03/08 14:40
 * @Version 1.0
 * @Description:
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class ChildCategoryServiceImpl implements ChildCategoryService {
    @Autowired
    private ChildCategoryDao childCategoryDao;

    @Override
    public void insert(ChildCategoryEntity childCategoryEntity) {
        childCategoryDao.insert(childCategoryEntity);
    }
}

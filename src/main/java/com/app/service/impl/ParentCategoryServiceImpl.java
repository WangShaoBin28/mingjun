package com.app.service.impl;

import com.app.dao.ParentCategoryDao;
import com.app.entity.ParentCategoryEntity;
import com.app.service.ParentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Package com.app.service.impl
 * @ClassName ParentCategoryServiceImpl
 * @Author shaobin.wang
 * @Date 2019/03/08 14:39
 * @Version 1.0
 * @Description:
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class ParentCategoryServiceImpl implements ParentCategoryService {
    @Autowired
    private ParentCategoryDao parentCategoryDao;

    @Override
    public void insert(ParentCategoryEntity parent) {
        parentCategoryDao.insert(parent);
    }
}

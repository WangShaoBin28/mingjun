package com.app.entity;

import lombok.Data;

/**
 * @Package com.app.entity
 * @ClassName CategoryEntity
 * @Author shaobin.wang
 * @Date 2019/03/08 14:03
 * @Version 1.0
 * @Description: 父分类
 **/
@Data
public class ChildCategoryEntity {
    private Long id;

    private Long parentId;

    private String childCategoryName;

    public ChildCategoryEntity(Long id, Long parentId, String childCategoryName) {
        this.id = id;
        this.parentId = parentId;
        this.childCategoryName = childCategoryName;
    }
}

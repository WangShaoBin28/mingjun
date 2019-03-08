package com.app.entity;

import lombok.Data;

/**
 * @Package com.app.entity
 * @ClassName ParentCategoryEntity
 * @Author shaobin.wang
 * @Date 2019/03/08 14:04
 * @Version 1.0
 * @Description: 父分类图片
 **/
@Data
public class ParentCategoryEntity {

    private Long id;

    private String parentName;

    private int orderNum;

    public ParentCategoryEntity(Long id, String parentName, int orderNum) {
        this.id = id;
        this.parentName = parentName;
        this.orderNum = orderNum;
    }
}

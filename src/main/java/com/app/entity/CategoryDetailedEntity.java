package com.app.entity;

import lombok.Data;

/**
 * @Package com.app.entity
 * @ClassName CategoryDetailedEntity
 * @Author shaobin.wang
 * @Date 2019/03/08 14:09
 * @Version 1.0
 * @Description:
 **/
@Data
public class CategoryDetailedEntity {

    private Long id;

    private String fileName;

    private String fileUrl;

    private Long childId;

    private int firstShow;

    public CategoryDetailedEntity(Long id, String fileName, String fileUrl, Long childId, int firstShow) {
        this.id = id;
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.childId = childId;
        this.firstShow = firstShow;
    }
}

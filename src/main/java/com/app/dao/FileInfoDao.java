package com.app.dao;

import com.app.entity.FileInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package com.app.dao
 * @ClassName FileInfoDao
 * @Author shaobin.wang
 * @Date 2019/03/01 12:06
 * @Version 1.0
 * @Description:
 **/
@Repository
@Mapper
public interface FileInfoDao {

    List<FileInfoEntity> selectFile();

}

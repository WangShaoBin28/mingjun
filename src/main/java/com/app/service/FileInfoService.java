package com.app.service;

import com.app.common.model.ReturnInfo;
import com.app.entity.FileInfoEntity;

import java.util.List;

/**
 * @Package com.app.service
 * @ClassName FileInfoService
 * @Author shaobin.wang
 * @Date 2019/03/01 12:07
 * @Version 1.0
 * @Description:
 **/
public interface FileInfoService {

    ReturnInfo<List<FileInfoEntity>> selectFile();
}

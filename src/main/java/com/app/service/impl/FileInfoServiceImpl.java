package com.app.service.impl;

import com.app.common.model.ReturnInfo;
import com.app.dao.FileInfoDao;
import com.app.entity.FileInfoEntity;
import com.app.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package com.app.service.impl
 * @ClassName FileInfoServiceImpl
 * @Author shaobin.wang
 * @Date 2019/03/01 12:08
 * @Version 1.0
 * @Description:
 **/
@Service
public class FileInfoServiceImpl implements FileInfoService {
    @Autowired
    private FileInfoDao fileInfoDao;

    @Override
    public ReturnInfo<List<FileInfoEntity>> selectFile() {
        return ReturnInfo.ofSuccess(fileInfoDao.selectFile());
    }
}

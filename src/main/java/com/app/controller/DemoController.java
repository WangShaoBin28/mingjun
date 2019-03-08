package com.app.controller;

import com.app.common.model.ReturnInfo;
import com.app.dao.CategoryDetailedDao;
import com.app.dao.ChildCategoryDao;
import com.app.dao.ParentCategoryDao;
import com.app.entity.CategoryDetailedEntity;
import com.app.entity.ChildCategoryEntity;
import com.app.entity.FileInfoEntity;
import com.app.entity.ParentCategoryEntity;
import com.app.service.CategoryDetailedService;
import com.app.service.ChildCategoryService;
import com.app.service.FileInfoService;
import com.app.service.ParentCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.FileInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

/**
 * @Package com.app.controller
 * @ClassName demoController
 * @Author shaobin.wang
 * @Date 2019/03/01 11:50
 * @Version 1.0
 * @Description:
 **/
@Controller
@Slf4j
public class DemoController {

    @Value("${fileUrl}")
    String fileUrl;

    @Autowired
    private FileInfoService fileInfoService;

    @Autowired
    private ChildCategoryService childCategoryService;

    @Autowired
    private CategoryDetailedService categoryDetailedService;

    @Autowired
    private ParentCategoryService parentCategoryService;


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/file")
    @ResponseBody
    public String readFile() {
        File file = new File("D:\\桌面\\新建文件夹\\猪四爷3D效果图-中式风格");
        File[] files = file.listFiles();
        //保存
        ParentCategoryEntity parent = new ParentCategoryEntity(null, "中式", 1);
        parentCategoryService.insert(parent);
        for (int i = 0; i < files.length; i++) {
            //拼接成一个地址加文件名称保存到数据库
            ChildCategoryEntity childCategoryEntity = new ChildCategoryEntity(null, parent.getId(), files[i].getName());
            childCategoryService.insert(childCategoryEntity);
            //插入获取ID
            File[] files1 = files[i].listFiles();
            for (int i1 = 0; i1 < files1.length; i1++) {
                CategoryDetailedEntity categoryDetailedEntity = new CategoryDetailedEntity(null, files1[i1].getName(), childCategoryEntity.getChildCategoryName() + "/" + files1[i1].getName(), childCategoryEntity.getId(), i1 == 0 ? 1 : 2);
                categoryDetailedService.insert(categoryDetailedEntity);
            }
        }
        return "ok";
    }

    @GetMapping("/fileList")
    @ResponseBody
    public ReturnInfo<List<FileInfoEntity>> fileList() {
        return fileInfoService.selectFile();
    }
}

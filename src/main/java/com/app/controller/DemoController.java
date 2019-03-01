package com.app.controller;

import com.app.common.model.ReturnInfo;
import com.app.entity.FileInfoEntity;
import com.app.service.FileInfoService;
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

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/file")
    public String readFile() {
        File file = new File(fileUrl);
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            //拼接成一个地址加文件名称保存到数据库
            System.out.println(fileUrl + "/" + files[i].getName());
            log.info("文件地址{}--  ", fileUrl + "/" + files[i].getName());
        }
        return "ok";
    }

    @GetMapping("/fileList")
    @ResponseBody
    public ReturnInfo<List<FileInfoEntity>> fileList() {
        return fileInfoService.selectFile();
    }
}

package org.demo.controller;

import org.demo.config.Upload;
import org.demo.constants.UploadType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.File;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello(String msg){
        return msg+ System.currentTimeMillis();
    }

    @PostMapping(value = "/upload")
    @Upload(type = UploadType.文件)
    public String upload(@RequestBody MultipartFile file){
        return file.getName();
    }
}

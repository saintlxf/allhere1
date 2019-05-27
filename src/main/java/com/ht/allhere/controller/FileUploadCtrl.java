package com.ht.allhere.controller;

import com.ht.allhere.common.Result;
import com.ht.allhere.common.ResultCode;
import com.ht.allhere.utils.FileUtil;
import com.ht.allhere.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class FileUploadCtrl {
    @Value("${custom.file.path}")
    private String uploadPath;
    @RequestMapping("/upload")
    public @ResponseBody Result upload(@RequestParam("file") MultipartFile file){
        if (file.isEmpty()) {
            return new Result(ResultCode.FILE_UPLOAD_ERROR);
        }
        String fileName = file.getOriginalFilename();
        String fileExtName = FileUtil.getFileExtName(fileName);
        File dest = new File(uploadPath + UUIDUtil.getUUID()+"."+fileExtName);
        try {
            file.transferTo(dest);
            return new Result(ResultCode.SUCCESS);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Result(ResultCode.FILE_UPLOAD_ERROR);
    }
}

package com.ht.allhere.utils;

import java.io.File;

public class FileUtil {
    // 得到文件名
    public static String getFileMainName(String fileName){
        int dotIndex = fileName.indexOf(".");
        if(dotIndex>0) {
            return fileName.substring(0, dotIndex);
        }else if(dotIndex==0){
            return "";
        }else{
            return fileName;
        }
    }

    // 得到文件扩展名
    public static String getFileExtName(String fileName){
        int dotIndex = fileName.indexOf(".");
        if(dotIndex>0) {
            return fileName.substring(dotIndex+1);
        }else if(dotIndex==0){
            return fileName.substring(1);
        }else{
            return "";
        }
    }
}

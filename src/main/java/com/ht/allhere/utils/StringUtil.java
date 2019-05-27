package com.ht.allhere.utils;

public class StringUtil {
    public static boolean isNullOrBlank(String str){
        if(str==null){
            return true;
        }
        if(str.trim().equals("")){
            return true;
        }
        return false;
    }
}

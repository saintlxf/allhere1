package com.ht.allhere.utils;

import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtil {
    public  static long convert2Long(String date,String format){
        if(StringUtils.isEmpty(date)|| StringUtils.isEmpty(format)||date.toLowerCase().equals("null")){
            return 0l;
        }
        try {
            SimpleDateFormat sf = new SimpleDateFormat(format);
            sf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
            return sf.parse(date).getTime();
        } catch (ParseException e) {
            //e.printStackTrace();
        }
        return 0l;
    }

    public static String conver2String(long datetime,String format){
        if (datetime > 0l) {
            if (StringUtils.isEmpty(format))
                format = "yyyy-MM-dd";
            SimpleDateFormat sf = new SimpleDateFormat(format);
            Date date = new Date(datetime);
            return sf.format(date);
        }
        return "";
    }
}

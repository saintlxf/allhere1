package com.ht.allhere.pojo.entity;

import com.ht.allhere.pojo.vo.LawVO;
import com.ht.allhere.utils.DateTimeUtil;

import java.util.Date;

public class Law {
    private int id;
    private String name;
    private int type;
    private Date recordDate;
    private String source;
    private int file_content_id;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFile_content_id() {
        return file_content_id;
    }

    public void setFile_content_id(int file_content_id) {
        this.file_content_id = file_content_id;
    }

    public Law() {
    }
    public Law(LawVO lawVO){
        this.id = lawVO.getId();
        this.name = lawVO.getName();
        this.type = lawVO.getType();
        this.recordDate = new Date(DateTimeUtil.convert2Long(lawVO.getRecordDate(),"yyyy-MM-dd"));
        this.source = lawVO.getSource();
    }
}

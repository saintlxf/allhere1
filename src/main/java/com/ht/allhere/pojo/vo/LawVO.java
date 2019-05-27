package com.ht.allhere.pojo.vo;

import com.ht.allhere.utils.DateTimeUtil;

import java.util.Date;

public class LawVO {
    private int id;
    private String name;
    private int type;
    private String recordDate;
    private String source;
    private String content;

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

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LawVO(){

    }
    public LawVO(com.ht.allhere.pojo.entity.Law law){
        this.id = law.getId();
        this.name = law.getName();
        this.type = law.getType();
        this.recordDate = DateTimeUtil.conver2String(law.getRecordDate().getTime(),"yyyy-MM-dd");
        this.source = law.getSource();
    }
}

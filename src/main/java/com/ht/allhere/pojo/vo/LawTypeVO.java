package com.ht.allhere.pojo.vo;

import com.ht.allhere.pojo.entity.LawType;

public class LawTypeVO {
    private int id;
    private String name;

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
    public LawTypeVO(){

    }
    public LawTypeVO(LawType lawType){
        this.id = lawType.getId();
        this.name = lawType.getName();
    }
}

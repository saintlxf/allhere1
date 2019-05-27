package com.ht.allhere.dao;

import com.ht.allhere.pojo.entity.Law;

import java.util.List;

public interface LawsDao {
    public List<Law> getAllLaws();
    public void addLaw(Law law);
}

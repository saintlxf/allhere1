package com.ht.allhere.dao;

import com.ht.allhere.pojo.entity.FileContent;

public interface FileContentDao {
    public int addContentAndGetId(FileContent fileContent);
    public FileContent getAllContentById(int id);
}

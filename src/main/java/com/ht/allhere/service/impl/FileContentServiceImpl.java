package com.ht.allhere.service.impl;

import com.ht.allhere.dao.FileContentDao;
import com.ht.allhere.pojo.entity.FileContent;
import com.ht.allhere.service.FileContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileContentServiceImpl implements FileContentService {
    @Autowired
    private FileContentDao fileContentDao;
    @Override
    public int addContentAndGetId(FileContent fileContent) {
        return fileContentDao.addContentAndGetId(fileContent);
    }
}

package com.ht.allhere.service.impl;

import com.ht.allhere.dao.LawTypeDao;
import com.ht.allhere.dao.LawsDao;
import com.ht.allhere.pojo.entity.Law;
import com.ht.allhere.pojo.entity.LawType;
import com.ht.allhere.service.LawsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LawsServiceImpl implements LawsService {
    @Autowired
    private LawsDao lawsDao;
    @Autowired
    private LawTypeDao lawTypeDao;
    @Override
    public List<Law> getAllLaw() {
        return lawsDao.getAllLaws();
    }

    @Override
    public List<LawType> getAllLawType() {
        return lawTypeDao.getAllLawsType();
    }

    @Override
    public void addLaw(Law law) {
        lawsDao.addLaw(law);
    }

}

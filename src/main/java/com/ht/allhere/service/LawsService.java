package com.ht.allhere.service;

import com.ht.allhere.pojo.entity.Law;
import com.ht.allhere.pojo.entity.LawType;

import java.util.List;

public interface LawsService {
    public List<Law> getAllLaw();

    public List<LawType> getAllLawType();
    public void addLaw(Law law);
}

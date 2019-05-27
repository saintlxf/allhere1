package com.ht.allhere.controller;

import com.ht.allhere.common.Result;
import com.ht.allhere.common.ResultCode;
import com.ht.allhere.pojo.entity.FileContent;
import com.ht.allhere.pojo.entity.Law;
import com.ht.allhere.pojo.entity.LawType;
import com.ht.allhere.pojo.vo.LawVO;
import com.ht.allhere.pojo.vo.LawTypeVO;
import com.ht.allhere.service.FileContentService;
import com.ht.allhere.service.LawsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/laws")
public class LawsCtrl {
    @Autowired
    private LawsService lawsService;
    @Autowired
    private FileContentService fileContentService;
    @RequestMapping("/listAll")
    public List<LawVO> listAll(){
        List<LawVO> ret = new LinkedList<>();
        List<com.ht.allhere.pojo.entity.Law> listLaw = lawsService.getAllLaw();

        for (com.ht.allhere.pojo.entity.Law law :
                listLaw) {
            ret.add(new LawVO(law));
        }
        return ret;
    }
    @RequestMapping("/listAllLawType")
    public  List<LawTypeVO> listAllLawType(){
        List<LawTypeVO> ret = new LinkedList<>();
        List<LawType> listLawType = lawsService.getAllLawType();
        for (LawType lawType :
                listLawType) {
            ret.add(new LawTypeVO(lawType));
        }
        return ret;
    }
    @RequestMapping("/saveLaw")
    public Result saveLaw(@RequestBody LawVO lawVO){
        // 保存文档
        FileContent fileContent = new FileContent();
        fileContent.setContent(lawVO.getContent());
        System.out.println(lawVO.getContent());
        fileContentService.addContentAndGetId(fileContent);
        System.out.println("contentId:"+fileContent.getId());
        Law law = new Law(lawVO);
        law.setFile_content_id(fileContent.getId());
        law.setStatus(1);
        lawsService.addLaw(law);
        return new Result(ResultCode.SUCCESS);
    }
}

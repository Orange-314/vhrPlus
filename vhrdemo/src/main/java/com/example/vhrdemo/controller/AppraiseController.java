package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Appraise;
import com.example.vhrdemo.service.IAppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping(value = "/Appraise")
public class AppraiseController {
    @Autowired
    private IAppraiseService iAppraiseService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    private Appraise search(@RequestParam int eid){
        System.out.println("eid="+eid);
        return iAppraiseService.search(eid);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private String update(@RequestParam int eid, @RequestParam Date appDate, @RequestParam String appResult, @RequestParam String appContent,  @RequestParam String remark){
        return "成功更新"+iAppraiseService.update(eid, appDate, appResult, appContent, remark)+"条数据";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private String insert(@RequestParam int eid, @RequestParam Date appDate, @RequestParam String appResult, @RequestParam String appContent,  @RequestParam String remark){
        return "成功插入"+ iAppraiseService.insert(eid, appDate, appResult, appContent, remark)+"条数据";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private String delete(@RequestBody  Appraise appraise){
        return "成功删除" + iAppraiseService.delete(appraise.getEid())+"条数据";
    }
}

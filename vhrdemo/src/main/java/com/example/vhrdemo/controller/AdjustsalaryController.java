package com.example.vhrdemo.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.vhrdemo.entity.Adjustsalary;
import com.example.vhrdemo.service.IAdjustsalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping(value = "/Adjustsalary")
public class AdjustsalaryController {
    @Autowired
    private IAdjustsalaryService iAdjustsalaryService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    private Adjustsalary search(@RequestParam int eid){
        System.out.println("eid="+eid);
        return iAdjustsalaryService.search(eid);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private String update(@RequestParam int eid, @RequestParam Date asDate,@RequestParam int beforeSalary,@RequestParam int afterSalary,@RequestParam String reason,@RequestParam String remark){
        return "成功更新"+iAdjustsalaryService.update(eid, asDate, beforeSalary, afterSalary, reason, remark)+"条数据";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private String insert(@RequestParam int eid, @RequestParam Date asDate,@RequestParam int beforeSalary,@RequestParam int afterSalary,@RequestParam String reason,@RequestParam String remark){
        return "成功插入"+ iAdjustsalaryService.insert(eid, asDate, beforeSalary, afterSalary, reason, remark)+"条数据";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private String delete(@RequestBody Adjustsalary adjustsalary){
        return "成功删除" + iAdjustsalaryService.delete(adjustsalary.getEid())+"条数据";
    }
}

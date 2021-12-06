package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Salary;
import com.example.vhrdemo.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/salary")
public class SalaryController {
    @Autowired
    private ISalaryService iSalaryService;

    @RequestMapping(value = "/findall", method = RequestMethod.POST)
    private List<Salary> findall(){
        return iSalaryService.findall();
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    private Salary search(@RequestParam String name){
        return iSalaryService.search(name);
    }

    @RequestMapping(value = "/select", method = RequestMethod.POST)
    private Salary select(@RequestParam int id){
        return iSalaryService.select(id);
    }

    @RequestMapping(value = "/insert1", method = RequestMethod.POST)
    private String insert1(@RequestParam int basicSalary,@RequestParam int bonus,@RequestParam int lunchSalary,@RequestParam int trafficSalary,@RequestParam int allSalary){
        return "成功插入" + iSalaryService.insert1(basicSalary,bonus,lunchSalary,trafficSalary,allSalary) + "条数据";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private String insert(@RequestParam int basicSalary,@RequestParam int bonus,@RequestParam int lunchSalary,@RequestParam int trafficSalary,@RequestParam int allSalary,@RequestParam int pensionBase,@RequestParam float pensionPer,@RequestParam int medicalBase,@RequestParam float medicalPer,@RequestParam int accumulationFundBase,@RequestParam float accumulationFundPer,@RequestParam String name){
        return "成功插入" + iSalaryService.insert(basicSalary,bonus,lunchSalary,trafficSalary,allSalary,pensionBase,pensionPer,medicalBase,medicalPer,accumulationFundBase,accumulationFundPer,name) + "条数据";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private String update(@RequestParam int id,@RequestParam int basicSalary,@RequestParam int bonus,@RequestParam int lunchSalary,@RequestParam int trafficSalary,@RequestParam int allSalary,@RequestParam int pensionBase,@RequestParam float pensionPer,@RequestParam int medicalBase,@RequestParam float medicalPer,@RequestParam int accumulationFundBase,@RequestParam float accumulationFundPer,@RequestParam String name){
        return "成功更新" + iSalaryService.update(id,basicSalary,bonus,lunchSalary,trafficSalary,allSalary,pensionBase,pensionPer,medicalBase,medicalPer,accumulationFundBase,accumulationFundPer,name) + "条数据";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private String delete(@RequestParam int id){
        return "成功删除" + iSalaryService.delete(id) + "条数据";
    }
}

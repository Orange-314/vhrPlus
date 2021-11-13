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

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private Salary insert(@RequestParam int id,@RequestParam String name){
        return iSalaryService.insert(id,name);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private Salary update(@RequestParam int id,@RequestParam int basicSalary,@RequestParam int bonus,@RequestParam int lunchSalary,@RequestParam int trafficSalary,@RequestParam int allSalary,@RequestParam int pensionBase,@RequestParam float pensionPer,@RequestParam int medicalBase,@RequestParam float medicalPer,@RequestParam int accumulationFundBase,@RequestParam float accumulationFundPer,@RequestParam String name){
        return iSalaryService.update(id,basicSalary,bonus,lunchSalary,trafficSalary,allSalary,pensionBase,pensionPer,medicalBase,medicalPer,accumulationFundBase,accumulationFundPer,name);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private Salary delete(@RequestParam String name){
        return iSalaryService.delete(name);
    }
}

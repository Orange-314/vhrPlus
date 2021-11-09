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
        return iSalaryService.insert(id, name);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private Salary delete(@RequestParam String name){
        return iSalaryService.delete(name);
    }
}

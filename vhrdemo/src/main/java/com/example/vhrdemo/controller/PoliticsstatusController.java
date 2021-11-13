package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Politicsstatus;
import com.example.vhrdemo.service.IPoliticsstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/politicsstatus")
public class PoliticsstatusController {
    @Autowired
    private IPoliticsstatusService iPoliticsstatusService;

    @RequestMapping(value = "/search")
    private Politicsstatus search(@RequestParam int id) {
        return iPoliticsstatusService.search(id);
    }

    @RequestMapping(value = "/insert")
    private String insert(@RequestParam int id, @RequestParam String name){
        return "插入成功"+iPoliticsstatusService.insert(id, name)+"条消息";
    }

    @RequestMapping(value = "/update")
    private String update(@RequestParam int id, @RequestParam String name){
        return "更新成功"+iPoliticsstatusService.update(id, name)+"条消息";
    }

    @RequestMapping(value = "/delete")
    private String delete(@RequestParam int id){
        return "删除成功"+ iPoliticsstatusService.delete(id)+"条消息";
    }
}
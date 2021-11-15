package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Nation;
import com.example.vhrdemo.service.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/nation")
public class NationController {
    @Autowired
    private INationService iNationService;

    @RequestMapping(value = "/findall", method = RequestMethod.POST)
    private List<Nation> findall(){
        return iNationService.findall();
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    private Nation search(@RequestParam String name){
        return iNationService.search(name);
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private String update(@RequestParam int id, @RequestParam String name){
        return "更新成功"+ iNationService.update(id, name)+"条消息";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private String insert(@RequestParam int id,@RequestParam String name){
        return "插入成功"+ iNationService.insert(id, name)+"条消息";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private String delete(@RequestParam String name){
        return "插入成功"+ iNationService.delete(name)+"条消息";
    }
}
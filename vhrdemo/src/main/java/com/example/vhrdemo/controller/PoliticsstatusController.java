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
    private Politicsstatus insert(@RequestParam int id, @RequestParam String name){
        return iPoliticsstatusService.insert(id, name);
    }

    @RequestMapping(value = "/update")
    private Politicsstatus update(@RequestParam int id, @RequestParam String name){
        return iPoliticsstatusService.update(id, name);
    }

    @RequestMapping(value = "/delete")
    private Politicsstatus delete(@RequestParam int id){
        return iPoliticsstatusService.delete(id);
    }
}
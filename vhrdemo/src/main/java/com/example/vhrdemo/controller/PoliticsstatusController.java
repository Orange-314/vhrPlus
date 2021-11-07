package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Politicsstatus;
import com.example.vhrdemo.service.IPoliticsstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/politicsstatus")
public class PoliticsstatusController {
    @Autowired(required = false)
    private IPoliticsstatusService iPoliticsstatusService;

    @RequestMapping(value = "/search")
    private Politicsstatus search(@RequestParam int id) {
        return iPoliticsstatusService.search(id);
    }

}
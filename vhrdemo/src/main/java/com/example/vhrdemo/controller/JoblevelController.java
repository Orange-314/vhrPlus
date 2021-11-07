package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Employee;
import com.example.vhrdemo.entity.Joblevel;
import com.example.vhrdemo.service.IJoblevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/joblevel")
public class JoblevelController {
    @Autowired
    private IJoblevelService iJoblevelService;

    @RequestMapping(value = "/findall", method = RequestMethod.POST)
    private List<Joblevel> findall(){
        return iJoblevelService.findall();
    }

    @RequestMapping(value = "/searchDetail", method = RequestMethod.POST)
    private Joblevel search2(@RequestBody Joblevel joblevel){
        return iJoblevelService.searchDetail(joblevel.getName(), joblevel.getTitleLevel());
    }


    @RequestMapping(value = "/updateName", method = RequestMethod.POST)
    private Joblevel update(@RequestParam String name, @RequestParam String titleLevel){
        return iJoblevelService.updateName(name, titleLevel);
    }

    @RequestMapping(value = "/updateTitlelevel", method = RequestMethod.POST)
    private Joblevel update2(@RequestParam String name, @RequestParam String titleLevel){
        return iJoblevelService.updateTitlelevel(name, titleLevel);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private Joblevel insert(@RequestParam int id,@RequestParam String name, @RequestParam String titleLevel){
        return iJoblevelService.insert(id, name, titleLevel);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private Joblevel delete(@RequestParam String name, @RequestParam String titleLevel){
        return iJoblevelService.delete(name, titleLevel);
    }
}

package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Joblevel;
import com.example.vhrdemo.service.IJoblevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/joblevel")
public class JoblevelController {
    @Autowired(required=false)
    private IJoblevelService iJoblevelService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    private Joblevel search(){
        return iJoblevelService.search();
    }

    @RequestMapping(value = "/search2", method = RequestMethod.POST)
    private Joblevel search2(@RequestBody Joblevel joblevel){
        return iJoblevelService.search2(joblevel.getName(), joblevel.getTitleLevel());
    }

    @RequestMapping(value = "/login3", method = RequestMethod.POST)
    private List<Joblevel> login3(@RequestParam int id){
        return iJoblevelService.login3(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private Joblevel update(@RequestParam String name, @RequestParam String titleLevel){
        return iJoblevelService.update(name, titleLevel);
    }

    @RequestMapping(value = "/update2", method = RequestMethod.POST)
    private Joblevel update2(@RequestParam String name, @RequestParam String titleLevel){
        return iJoblevelService.update2(name, titleLevel);
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

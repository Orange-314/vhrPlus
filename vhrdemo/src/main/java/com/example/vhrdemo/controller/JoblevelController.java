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
    private String update(@RequestParam String name, @RequestParam String titleLevel){
        return "成功更新" + iJoblevelService.updateName(name, titleLevel) + "条数据";
    }

    @RequestMapping(value = "/updateTitlelevel", method = RequestMethod.POST)
    private String update2(@RequestParam String name, @RequestParam String titleLevel){
        return "成功更新" + iJoblevelService.updateTitlelevel(name, titleLevel) + "条数据";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private String insert(@RequestParam int id,@RequestParam String name, @RequestParam String titleLevel){
        return "成功插入" + iJoblevelService.insert(id, name, titleLevel) + "条数据";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private String delete(@RequestParam String name){
        return "成功删除" + iJoblevelService.delete(name) + "条数据";
    }
}

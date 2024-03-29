package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Position;
import com.example.vhrdemo.entity.Role;
import com.example.vhrdemo.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/position")
public class PositionController {

    @Autowired(required = false)
    private IPositionService iPositionService;

    @RequestMapping(value = "/search")
    private Position search(@RequestParam int id){
        return iPositionService.search(id);
    }

    @RequestMapping(value = "/findall", method = RequestMethod.POST)
    private List<Position> findall(){
        return iPositionService.findall();
    }

    @RequestMapping(value = "/insert")
    private String insert(@RequestParam int id,@RequestParam String name){
        return "成功插入" + iPositionService.insert(id,name) +"条数据";
    }

    @RequestMapping(value = "/update")
    private String update(@RequestParam int id,@RequestParam String name){
        return "成功更新" + iPositionService.update(id,name) +"条数据";
    }

    @RequestMapping(value = "/update1")
    private String update1(@RequestParam int id,@RequestParam String name){
        return "成功更新" + iPositionService.update1(id,name) +"条数据";
    }

    @RequestMapping(value = "/delete")
    private String delete(@RequestParam int id){
        return "成功删除" + iPositionService.delete(id) +"条数据";
    }
}

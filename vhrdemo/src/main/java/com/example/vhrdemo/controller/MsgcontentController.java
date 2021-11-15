package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Joblevel;
import com.example.vhrdemo.entity.Msgcontent;
import com.example.vhrdemo.entity.Politicsstatus;
import com.example.vhrdemo.entity.Role;
import com.example.vhrdemo.service.IMsgcontentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/msgcontent")
public class MsgcontentController {
    @Autowired(required = false)
    private IMsgcontentService iMsgcontentService;

    @RequestMapping(value = "/findall", method = RequestMethod.POST)
    private List<Msgcontent> findall(){
        return iMsgcontentService.findall();
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    private Msgcontent search(@RequestParam int id) {
        return iMsgcontentService.search(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private String  insert(@RequestParam int id, @RequestParam String title, @RequestParam String message) {
        return "插入成功"+iMsgcontentService.insert(id, title, message)+"条消息";
    }

    @RequestMapping(value = "/updateid", method = RequestMethod.POST)
    private String  updateid(@RequestParam int id, @RequestParam String title){
        return "更新成功"+iMsgcontentService.updateid(id, title)+"条消息";
    }

    @RequestMapping(value = "/updatetitle", method = RequestMethod.POST)
    private String updatetitle(@RequestParam int id, @RequestParam String title) {
        return "更新成功"+ iMsgcontentService.updateid(id, title)+"条消息";
    }

    @RequestMapping(value = "/delete")
    private String delete(@RequestParam int id){
        return "删除成功"+iMsgcontentService.delete(id)+"条消息";
    }
}

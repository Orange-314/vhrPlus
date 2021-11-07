package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Msgcontent;
import com.example.vhrdemo.service.IMsgcontentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/msgcontent")
public class MsgcontentController {
    @Autowired(required = false)
    private IMsgcontentService iMsgcontentService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    private Msgcontent search(@RequestParam int id) {
        return iMsgcontentService.search(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private Msgcontent insert(@RequestParam int id, @RequestParam String title, @RequestParam String message) {
        return iMsgcontentService.insert(id, title, message);
    }
}

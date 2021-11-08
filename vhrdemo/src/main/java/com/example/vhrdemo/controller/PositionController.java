package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Position;
import com.example.vhrdemo.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/position")

public class PositionController {
    @Autowired(required = false)
    private IPositionService iPositionService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    private Position search(@RequestParam int id){
        return iPositionService.search(id);
    }
}

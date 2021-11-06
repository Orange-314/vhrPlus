package com.example.vhrdemo.controller;


import com.example.vhrdemo.entity.Hr;
import com.example.vhrdemo.service.IHrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/hr")
public class HrController {
    @Autowired
    private IHrService iHrService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private Hr login(@RequestParam String username, @RequestParam String password){
        return iHrService.login(username, password);
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    private Hr login2(@RequestBody Hr hr){
        return iHrService.login2(hr.getUsername(), hr.getPassword());
    }

    @RequestMapping(value = "/login3", method = RequestMethod.POST)
    private Hr login(@RequestParam int id){
        return iHrService.login3(id);
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private Hr update(@RequestParam String username, @RequestParam String password){
        return iHrService.update(username, password);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private Hr insert(@RequestParam int id,@RequestParam String username, @RequestParam String password){
        return iHrService.insert(id, username, password);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private Hr delete(@RequestParam String username, @RequestParam String password){
        return iHrService.delete(username, password);
    }
}

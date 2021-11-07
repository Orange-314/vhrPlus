package com.example.vhrdemo.controller;


import com.example.vhrdemo.entity.Role;
import com.example.vhrdemo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/role")
public class RoleController {
    @Autowired(required = false)
    private IRoleService iRoleService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    private Role search(@RequestParam int id){
        return iRoleService.search(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    private Role insert(@RequestParam int id,@RequestParam String name,@RequestParam String nameZh) {
        return iRoleService.insert(id, name, nameZh);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private Role update(@RequestParam String name,@RequestParam String nameZh) {
        return iRoleService.update(name, nameZh);
    }

    @RequestMapping(value = "/update2", method = RequestMethod.POST)
    private Role uodate2(@RequestParam String name,@RequestParam String nameZh){
         return iRoleService.update2(name,nameZh);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private Role delete(@RequestParam int id){
        return iRoleService.delete(id);
    }
}

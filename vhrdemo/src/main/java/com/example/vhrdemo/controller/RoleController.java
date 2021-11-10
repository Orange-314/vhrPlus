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
    private String insert(@RequestParam int id,@RequestParam String name,@RequestParam String nameZh) {
        return "成功插入" + iRoleService.insert(id, name, nameZh) + "条数据";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private String update(@RequestParam String name,@RequestParam String nameZh) {
        return "更新成功" + iRoleService.update(name, nameZh)+ "条数据";
    }

    @RequestMapping(value = "/update2", method = RequestMethod.POST)
    private String uodate2(@RequestParam String name,@RequestParam String nameZh){
         return "更新成功"+iRoleService.update2(name,nameZh)+"条数据";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    private String delete(@RequestParam int id){
        return "删除成功"+iRoleService.delete(id)+"条数据";
    }
}

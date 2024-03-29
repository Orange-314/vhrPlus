package com.example.vhrdemo.controller;

import com.example.vhrdemo.entity.Employee;
import com.example.vhrdemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @RequestMapping(value = "/findall", method = RequestMethod.POST)
    private List<Employee> findall(){
        return iEmployeeService.findall();
    }

    @RequestMapping(value = "/findDetail", method = RequestMethod.POST)
    private List<Employee> findDetail(){
        return iEmployeeService.findDetail();
    }

    @RequestMapping(value = "/insert2",method = RequestMethod.POST)
    private Employee insert2(@RequestParam Date birthday){
        return iEmployeeService.insert2(birthday);
    }

    @RequestMapping(value="/insert",method = RequestMethod.POST)
    private String insert(@RequestParam String name,@RequestParam String gender,@RequestParam Date birthday,@RequestParam String idCard,@RequestParam String wedlock,@RequestParam int nationId,@RequestParam String nativePlace,@RequestParam int politicId,@RequestParam String email,@RequestParam String phone,@RequestParam String address,@RequestParam int departmentId,@RequestParam int jobLevelId,@RequestParam int posId,@RequestParam String engageForm,@RequestParam String tiptopDegree,@RequestParam String specialty,@RequestParam String school,@RequestParam Date beginDate,@RequestParam double contractTerm,@RequestParam Date conversionTime,@RequestParam Date beginContract,@RequestParam Date endContract){
        return "成功插入" + iEmployeeService.insert(name,gender,birthday,idCard,wedlock,nationId,nativePlace,politicId,email,phone,address,departmentId,jobLevelId,posId,engageForm,tiptopDegree,specialty,school,beginDate,contractTerm,conversionTime,beginContract,endContract) + "条数据";
    }

    @RequestMapping(value = "/delete1", method = RequestMethod.POST)
    private String delete1(@RequestParam String idCard){
        return "删除成功"+iEmployeeService.delete1(idCard)+"条数据";
    }

    @RequestMapping(value = "/select", method = RequestMethod.POST)
    private Employee select(@RequestParam String idCard){
        return iEmployeeService.select(idCard);
    }

}

package com.UST.springbootEmployee.controller;

import com.UST.springbootEmployee.model.springbootModel;
import com.UST.springbootEmployee.service.springbootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class springbootController {
    @Autowired
    private springbootService springbootservice;
    @PostMapping("/")
    public springbootModel addspringbootModel(@RequestBody springbootModel springbootmodel){
         return springbootservice.createspringbootModel(springbootmodel);
    }
    @GetMapping("/emps")
    public List<springbootModel> getAllspringbootModel(){
        return springbootservice.getspringbootmodel();
    }
    @GetMapping("/emps/{id}")
    public springbootModel getspringbootModelById(@PathVariable int id){
        return springbootservice.getspringbootserviceBy(id);
    }
    @DeleteMapping("/del/{id}")
    public String deletespringModel(@PathVariable int Id){
        springbootservice.deletespringbootmodel(Id);
        return "element is deleted";
    }


}

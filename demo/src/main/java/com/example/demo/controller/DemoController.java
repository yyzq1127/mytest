package com.example.demo.controller;

import java.util.ArrayList;

import com.example.demo.domain.Demo;
import com.example.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;


    @RequestMapping("/")
    //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ArrayList<Demo> getPersonList(){
        return demoService.getPersonList();
    }
    @RequestMapping("/{id}")
    public Demo grtPersonById(@PathVariable int id){
        return demoService.getPersonById(id);
    }
    @RequestMapping("/add/name={name}age={age}")
    public void add(@PathVariable String name,@PathVariable int age){
        demoService.add(name,age);//
    }
    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public void deleteById(@PathVariable int id){
        demoService.deleteById(id);
    }
    @RequestMapping("/updata/id={id}name={name}age={age}")
    public void updateById(@PathVariable int id,@PathVariable String name,@PathVariable int age){
        demoService.updateById(id, name, age);
    }
}

package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.dao.DemoDao;
import com.example.demo.domain.Demo;

import org.springframework.beans.factory.annotation.Autowired;

public interface DemoService {
    @Autowired
    DemoDao demoDao = null;

    /**
     * CRUD
     */
    public Demo getPersonById(int id);
    public ArrayList<Demo>getPersonList();
    public void add(String name,int age);

    public void deleteById(int id);

    public void updateById(int id,String name,int age);
}

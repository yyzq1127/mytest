package com.example.demo.service.impl;

import java.util.ArrayList;

import com.example.demo.dao.DemoDao;
import com.example.demo.domain.Demo;
import com.example.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;

    @Override
    public Demo getPersonById(int id) {
        return demoDao.getPersonById(id);
    }

    @Override
	public ArrayList<Demo> getPersonList() {
        return demoDao.getPersonList();
	}

    @Override
    public void add(String name,int age) {
        demoDao.add(name,age);//
    }

    @Override
    public void deleteById(int id) {
        demoDao.delete(id);
    }

    @Override
    public void updateById(int id, String name, int age) {
        demoDao.updateById(name, age, id);

    }
}
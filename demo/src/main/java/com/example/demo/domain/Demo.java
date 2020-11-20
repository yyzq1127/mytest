package com.example.demo.domain;

public class Demo {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Demo() {
    }
    @Override
    public String toString(){
        return "id="+id+
                ",name="+name+
                ",age="+age;
    }
}

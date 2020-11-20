package com.example.demo.dao;

import java.util.ArrayList;

import com.example.demo.domain.Demo;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DemoDao {
    @Select("select * from person where id=#{id}")
    // 返回Map结果集
    @Results({ @Result(property = "id", column = "id"), })
    Demo getPersonById(@Param("id") int id);

    @Select("select * from person")
    ArrayList<Demo> getPersonList();


    @Insert("insert into person value(null,#{name},#{age})")
    void add(@Param("name") String name,@Param("age") int age);
    
    @Delete("delete from person where id =#{id}")
    void delete(@Param("id") int id);


    /**
     * UPDATE table_name
     * SET column1=value1,column2=value2,...
     * WHERE some_column=some_value;
     * 
     */
    @Update("update person set name=#{name},age=#{age} where id=#{id}")
    void updateById(@Param("name") String name,@Param("age") int age,@Param("id") int id);
}

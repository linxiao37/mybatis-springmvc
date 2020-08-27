package com.alan.mybatis.service;

import com.alan.mybatis.model.Person;

import java.util.List;

/**
 * @description:
 * @author: xiaolin35
 * @date: 2020/8/27 15:33
 */
public interface IPersonService {
    List<Person> selectList();
}

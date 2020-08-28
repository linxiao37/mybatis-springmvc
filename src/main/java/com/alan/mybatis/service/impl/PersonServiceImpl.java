package com.alan.mybatis.service.impl;

import com.alan.mybatis.mapper.PersonMapper;
import com.alan.mybatis.model.Person;
import com.alan.mybatis.model.PersonExample;
import com.alan.mybatis.service.IPersonService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: xiaolin35
 * @date: 2020/8/27 15:34
 */
@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonMapper personMapper;
    // @Resource
    // private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<Person> selectList() {
        // PersonMapper personMapper = sqlSessionTemplate.getMapper(PersonMapper.class);
        PersonExample example = new PersonExample();
        return personMapper.selectByExample(example);
    }
}

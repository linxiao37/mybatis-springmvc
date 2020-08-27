package com.alan.mybatis;

import com.alan.mybatis.model.Person;
import com.alan.mybatis.service.IPersonService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @description:
 * @author: xiaolin35
 * @date: 2020/8/27 10:19
 */
public class PersonTest extends BaseTest {

    @Autowired
    private IPersonService personService;

    @Test
    public void testPerson() {
        List<Person> persons = personService.selectList();
        System.out.println(persons.size());
    }
}

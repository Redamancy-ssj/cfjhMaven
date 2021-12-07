package com.buba.service.impl;

import com.buba.dao.PersonDao;
import com.buba.entity.Person;
import com.buba.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> findAll(){
        return personDao.findAll();
    }
}

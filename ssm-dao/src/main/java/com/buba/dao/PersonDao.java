package com.buba.dao;

import com.buba.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao {
    public List<Person> findAll();
}

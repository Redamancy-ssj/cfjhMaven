package com.buba.controller;

import com.buba.entity.Person;
import com.buba.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/person")
    public ModelAndView person(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",personService.findAll());
        mv.setViewName("personList");
        return mv;
    }

    @RequestMapping("/personList")
    public ModelAndView personList(){
        ModelAndView mav = new ModelAndView("personList");
        List<Person> list = personService.findAll();
        mav.addObject("list", list);
        return mav;
    }

}
package com.envers.demo.controllers;


import com.envers.demo.models.Test;
import com.envers.demo.repositories.ITestRepository;
import org.hibernate.envers.AuditReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    ITestRepository iTestRepository;

    @Autowired
    AuditReader auditReader;

    @RequestMapping(path = "",method = RequestMethod.POST)
    public Test create(@RequestBody Test test){
        return this.iTestRepository.save(test);
    }

    @RequestMapping(path = "",method = RequestMethod.PUT)
    public Test update(@RequestBody Test test){
        return this.iTestRepository.save(test);
    }

    @RequestMapping(path = "",method = RequestMethod.GET)
    public List<Test> list(){
        return this.iTestRepository.findAll();
    }



    @RequestMapping(path="/audit",method = RequestMethod.GET)
    public List<Test> audit(){
        return this.auditReader.createQuery().forRevisionsOfEntity(Test.class,true,true).getResultList();
    }

}

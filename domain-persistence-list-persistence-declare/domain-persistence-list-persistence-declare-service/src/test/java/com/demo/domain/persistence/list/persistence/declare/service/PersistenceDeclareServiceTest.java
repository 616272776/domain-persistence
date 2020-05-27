package com.demo.domain.persistence.list.persistence.declare.service;


import com.demo.domain.persistence.entity.common.entity.DomainDeclareEntity;
import com.demo.domain.persistence.entity.common.utils.PageUtils;
import com.demo.domain.persistence.list.persistence.declare.api.ListPersistenceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@SpringBootTest(classes = ListPersistenceDeclareServiceApplication.class)
@RunWith(SpringRunner.class)

public class PersistenceDeclareServiceTest {

    @Autowired
    private ListPersistenceService listPersistenceService;

    @Test
    public void listPersistenceDeclareTest(){
        DomainDeclareEntity domainDeclareEntity = new DomainDeclareEntity();
        domainDeclareEntity.setDomainDeclareId("1");
        domainDeclareEntity.setDomainClassName("form");
        domainDeclareEntity.setDomainName("表单");
        domainDeclareEntity.setDomainDescribe("村民填写的表单信息");

        PageUtils pageUtils = listPersistenceService.listPersistenceDeclare(domainDeclareEntity, new HashMap<>());
        System.out.println(pageUtils);
    }
}

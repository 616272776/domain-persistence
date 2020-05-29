package com.demo.domain.persistence.list.persistence.declare.service;


import com.demo.domain.persistence.entity.common.entity.DomainDeclareEntity;
import com.demo.domain.persistence.entity.common.entity.DomainEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import com.demo.domain.persistence.entity.common.param.OperationDescription;
import com.demo.domain.persistence.entity.common.utils.PageUtils;
import com.demo.domain.persistence.list.persistence.declare.api.ListPersistenceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

@SpringBootTest(classes = ListPersistenceDeclareApplication.class)
@RunWith(SpringRunner.class)

public class PersistenceDeclareServiceTest {

    @Autowired
    private ListPersistenceService listPersistenceService;

    @Test
    public void listPersistenceDeclareTest(){
        DomainEntity domainEntity = new DomainEntity();
        domainEntity.setDomainId("1");
        domainEntity.setDomainDeclareId("1");
        domainEntity.setDomainClassName("form");
        domainEntity.setDomainName("表单");
        domainEntity.setDomainDescribe("村民填写的表单信息");
        List<PersistenceEntity> persistenceEntityList = listPersistenceService.listPersistenceDeclare(domainEntity);
        System.out.println(persistenceEntityList);
    }
}

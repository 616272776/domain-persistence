package com.demo.domain.persistence.persistence.operation.list.service.service;

import com.demo.domain.persistence.entity.common.utils.PageUtils;
import com.demo.domain.persistence.persistence.operation.list.service.PersistenceOperationListApplication;
import com.demo.template.service.TemplateService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
@SpringBootTest(classes = PersistenceOperationListApplication.class)
@RunWith(SpringRunner.class)
class ListPersistenceServiceImplTest {

    @Autowired
    public TemplateService templateService;

    @Test
    void listPersistence() {
        PageUtils pageUtils = templateService.listTemplate(new HashMap<>());
        System.out.println(pageUtils);
    }
}
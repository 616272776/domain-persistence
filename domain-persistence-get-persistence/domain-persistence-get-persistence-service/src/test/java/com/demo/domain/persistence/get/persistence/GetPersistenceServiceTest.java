package com.demo.domain.persistence.get.persistence;

import com.demo.domain.persistence.entity.common.entity.PersistenceDeclareEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import com.demo.domain.persistence.get.persistence.api.GetPersistenceService;
import com.demo.domain.persistence.get.persistence.service.GetPersistenceServiceApplication;
import com.demo.domain.persistence.get.persistence.service.service.PersistenceService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = GetPersistenceServiceApplication.class)
@RunWith(SpringRunner.class)

public class GetPersistenceServiceTest {

    @Autowired
    private PersistenceService persistenceService;

    @Test
    public void getPersistenceTest(){
        PersistenceDeclareEntity persistenceDeclareEntity = new PersistenceDeclareEntity();
        persistenceDeclareEntity.setPersistenceDeclareId("1");
        persistenceDeclareEntity.setRelevance(0);
        persistenceDeclareEntity.setDomainDeclareId("1");

        PersistenceEntity persistence = persistenceService.getPersistence(persistenceDeclareEntity);
        System.out.println(persistence);
    }
}

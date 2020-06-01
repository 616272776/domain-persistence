package com.demo.domain.persistence.list.persistence.guide.service.service;

import com.demo.domain.persistence.entity.common.entity.DomainEntity;
import com.demo.domain.persistence.entity.common.enums.OperationTypeEnum;
import com.demo.domain.persistence.entity.common.param.OperationDescription;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.list.persistence.guide.api.DomainOperationService;
import com.demo.domain.persistence.list.persistence.guide.service.ListPersistenceGuideApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = ListPersistenceGuideApplication.class)
@RunWith(SpringRunner.class)
class DomainOperationServiceImplTest {

    @Autowired
    private DomainOperationService domainOperationService;

    @Test
    void listPersistenceOperation() {

        DomainEntity domainEntity = new DomainEntity();
        domainEntity.setDomainId("1");
        domainEntity.setDomainDeclareId("1");
        domainEntity.setDomainName("表单");
        domainEntity.setDomainDescribe("村民填写的表单信息");
        domainEntity.setDomainClassName("form");


        OperationDescription operationDescription = new OperationDescription();
        operationDescription.setOperationTypeEnum(OperationTypeEnum.INSERT);

        String domainData = "            {\n" +
                "                \"formId\": 1265539626123145217,\n" +
                "                \"templateId\": 1,\n" +
                "                \"formItem\": [\n" +
                "                    {\n" +
                "                        \"formItemId\": 1265539626156699650,\n" +
                "                        \"formId\": 1265539626123145217,\n" +
                "                        \"fieldName\": \"姓名1\",\n" +
                "                        \"fieldValue\": \"张三1\",\n" +
                "                        \"fieldType\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"formItemId\": 1265539626165088257,\n" +
                "                        \"formId\": 1265539626123145217,\n" +
                "                        \"fieldName\": \"年龄1\",\n" +
                "                        \"fieldValue\": \"101\",\n" +
                "                        \"fieldType\": 0\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"formItemId\": 1265539626165088258,\n" +
                "                        \"formId\": 1265539626123145217,\n" +
                "                        \"fieldName\": \"兴趣1\",\n" +
                "                        \"fieldValue\": \"打篮球，乒乓球1\",\n" +
                "                        \"fieldType\": 0\n" +
                "                    }\n" +
                "                ]\n" +
                "            }";

        operationDescription.setDomainData(domainData);

        List<PersistenceOperationGuide> persistenceOperationGuideList = domainOperationService.listPersistenceOperation(domainEntity, operationDescription);
        System.out.println(persistenceOperationGuideList);
    }
}
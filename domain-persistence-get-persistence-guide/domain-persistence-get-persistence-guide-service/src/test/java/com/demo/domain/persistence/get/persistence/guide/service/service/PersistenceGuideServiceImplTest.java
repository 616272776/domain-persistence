package com.demo.domain.persistence.get.persistence.guide.service.service;

import com.demo.domain.persistence.entity.common.entity.DomainEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import com.demo.domain.persistence.entity.common.enums.OperationTypeEnum;
import com.demo.domain.persistence.entity.common.param.OperationDescription;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationParam;
import com.demo.domain.persistence.get.persistence.guide.api.PersistenceGuideService;
import com.demo.domain.persistence.get.persistence.guide.service.GetPersistenceGuideApplication;
import com.demo.domain.persistence.get.persistence.guide.service.utils.MapperUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = GetPersistenceGuideApplication.class)
@RunWith(SpringRunner.class)
class PersistenceGuideServiceImplTest {

    @Autowired
    private PersistenceGuideService persistenceGuideService;

    /**
     * 测试新增
     */
    @Test
    void getPersistenceOperation() throws Exception {

        PersistenceOperationParam persistenceOperationParam  = getParamsWithSave();
        PersistenceOperationGuide persistenceOperationGuide = persistenceGuideService.getPersistenceOperation(persistenceOperationParam);
        String json = MapperUtils.obj2json(persistenceOperationGuide);

        String expectJson = "{\"persistenceEntity\":{\"persistenceId\":\"1\",\"persistenceDeclareId\":\"1\",\"persistenceClassName\":\"form\",\"relevance\":0,\"persistenceName\":\"表单\",\"persistenceDescribe\":\"表单基本属性\",\"extractWay\":\"0\",\"location\":\"0\"},\"operationTypeEnum\":\"INSERT\"}";
        String expectSaveCondition = "{\"condition\":{\"generateClass\":[{\"object\":{\"formId\":1265539626123145217,\"templateId\":1},\"beanMap\":{\"formId\":1265539626123145217,\"templateId\":1}}]}}";

        System.out.println(persistenceOperationGuide);
    }

    /**
     * 新增的数据
     * @return
     */
    private PersistenceOperationParam getParamsWithSave() {
        PersistenceOperationParam persistenceOperationParam = new PersistenceOperationParam();

        DomainEntity domainEntity = new DomainEntity();
        domainEntity.setDomainId("1");
        domainEntity.setDomainDeclareId("1");
        domainEntity.setDomainClassName("form");
        domainEntity.setDomainName("表单");
        domainEntity.setDomainDescribe("表单基本数据");
        persistenceOperationParam.setDomainEntity(domainEntity);

        PersistenceEntity persistenceEntity = new PersistenceEntity();
        persistenceEntity.setPersistenceId("1");
        persistenceEntity.setPersistenceDeclareId("1");
        persistenceEntity.setPersistenceClassName("form");
        persistenceEntity.setRelevance(0);
        persistenceEntity.setPersistenceName("表单");
        persistenceEntity.setPersistenceDescribe("表单基本属性");
        persistenceEntity.setExtractWay("0");
        persistenceEntity.setLocation("0");
        persistenceOperationParam.setPersistenceEntity(persistenceEntity);

        OperationDescription operationDescription = new OperationDescription();
        operationDescription.setOperationTypeEnum(OperationTypeEnum.INSERT);
        operationDescription.setAbstractCondition(null);
        String json = "            {\n" +
                "                \"formId\": 1265539626123145217,\n" +
                "                \"templateId\": 1,\n" +
                "                \"formItemVOList\": [\n" +
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
        operationDescription.setDomainData(json);
        persistenceOperationParam.setOperationDescription(operationDescription);



        return persistenceOperationParam;

    }
}
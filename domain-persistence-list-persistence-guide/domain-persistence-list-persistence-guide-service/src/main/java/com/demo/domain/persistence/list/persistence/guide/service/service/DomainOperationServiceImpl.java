package com.demo.domain.persistence.list.persistence.guide.service.service;

import com.demo.domain.persistence.entity.common.entity.DomainEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import com.demo.domain.persistence.entity.common.param.OperationDescription;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationParam;
import com.demo.domain.persistence.get.persistence.guide.api.PersistenceGuideService;
import com.demo.domain.persistence.list.persistence.declare.api.ListPersistenceService;
import com.demo.domain.persistence.list.persistence.guide.api.DomainOperationService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(version = "1.0.0")
public class DomainOperationServiceImpl implements DomainOperationService {

    @Reference(version = "1.0.0")
    private ListPersistenceService listPersistenceService;

    @Reference(version = "1.0.0")
    private PersistenceGuideService persistenceGuideService;

    @Override
    public List<PersistenceOperationGuide> listPersistenceOperation(DomainEntity domainEntity, OperationDescription operationDescription) {
        // 将领域对象转换成持久化对象集合
        List<PersistenceEntity> persistenceEntityList = listPersistenceService.listPersistenceDeclare(domainEntity);

        // 将持久化对象转换操作生成持久化操作集合
        List<PersistenceOperationGuide> persistenceOperationGuideList = persistenceEntityList.stream().map((item) -> {
            // 配置持久化对象操作参数
            PersistenceOperationParam persistenceOperationParam = new PersistenceOperationParam();
            persistenceOperationParam.setDomainEntity(domainEntity);
            persistenceOperationParam.setPersistenceEntity(item);
            persistenceOperationParam.setOperationDescription(operationDescription);

            // 调用持久化操作生成
            PersistenceOperationGuide persistenceOperation = persistenceGuideService.getPersistenceOperation(persistenceOperationParam);
            return persistenceOperation;
        }).collect(Collectors.toList());
        return persistenceOperationGuideList;
    }
}


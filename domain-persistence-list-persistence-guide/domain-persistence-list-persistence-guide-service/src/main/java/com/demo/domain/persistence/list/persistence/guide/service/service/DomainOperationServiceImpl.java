package com.demo.domain.persistence.list.persistence.guide.service.service;

import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationParam;
import com.demo.domain.persistence.entity.common.utils.PageUtils;
import com.demo.domain.persistence.list.persistence.declare.api.ListPersistenceService;
import com.demo.domain.persistence.list.persistence.guide.api.DomainOperationService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DomainOperationServiceImpl implements DomainOperationService {

    @Reference(version = "1.0.0")
    private ListPersistenceService listPersistenceService;

    @Override
    public PersistenceOperationGuide listPersistenceOperation(PersistenceOperationParam persistenceOperationParam, Map<String, Object> params) {
        // 将领域对象转换成持久化对象集合
        PageUtils pageUtils = listPersistenceService.listPersistenceDeclare(persistenceOperationParam.getDomainDeclareEntity(), params);

        // todo 调用具体的操作转换微服务

        return null;
    }
}

package com.demo.domain.persistence.persistence.operation.list.service.service;

import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import com.demo.domain.persistence.entity.common.param.ListCondition;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.utils.PageUtils;
import com.demo.domain.persistence.persistence.operation.list.api.ListPersistenceService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class ListPersistenceServiceImpl implements ListPersistenceService {

    @Override
    public PageUtils listPersistence(PersistenceOperationGuide persistenceOperationGuide) {

        // 获取查询条件
        ListCondition listCondition = (ListCondition) persistenceOperationGuide.getCondition();

        // 获取持久类信息
        PersistenceEntity persistenceEntity = persistenceOperationGuide.getPersistenceEntity();



        return null;
    }
}

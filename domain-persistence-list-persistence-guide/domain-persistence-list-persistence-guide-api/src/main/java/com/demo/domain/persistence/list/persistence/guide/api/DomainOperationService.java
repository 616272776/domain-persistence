package com.demo.domain.persistence.list.persistence.guide.api;

import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationParam;

import java.util.Map;

public interface DomainOperationService {
    public PersistenceOperationGuide listPersistenceOperation(PersistenceOperationParam persistenceOperationParam, Map<String, Object> params);
}

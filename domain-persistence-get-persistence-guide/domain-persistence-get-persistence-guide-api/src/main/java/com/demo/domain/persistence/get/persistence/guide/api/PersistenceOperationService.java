package com.demo.domain.persistence.get.persistence.guide.api;

import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationParam;

public interface PersistenceOperationService {
    public PersistenceOperationGuide getPersistenceOperation(PersistenceOperationParam persistenceOperationParam);
}

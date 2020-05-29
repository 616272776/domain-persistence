package com.demo.domain.persistence.list.persistence.guide.api;

import com.demo.domain.persistence.entity.common.entity.DomainEntity;
import com.demo.domain.persistence.entity.common.param.OperationDescription;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationParam;

import java.util.List;
import java.util.Map;

public interface DomainOperationService {
    public List<PersistenceOperationGuide> listPersistenceOperation(DomainEntity domainEntity, OperationDescription operationDescription);
}

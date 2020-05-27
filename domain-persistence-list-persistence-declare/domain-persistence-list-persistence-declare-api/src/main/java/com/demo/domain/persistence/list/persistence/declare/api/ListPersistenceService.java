package com.demo.domain.persistence.list.persistence.declare.api;

import com.demo.domain.persistence.entity.common.entity.DomainDeclareEntity;
import com.demo.domain.persistence.entity.common.utils.PageUtils;

import java.util.Map;

public interface ListPersistenceService {
    public PageUtils listPersistenceDeclare(DomainDeclareEntity domainDeclareEntity, Map<String, Object> params);
}

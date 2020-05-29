package com.demo.domain.persistence.list.persistence.declare.api;

import com.demo.domain.persistence.entity.common.entity.DomainDeclareEntity;
import com.demo.domain.persistence.entity.common.entity.DomainEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import com.demo.domain.persistence.entity.common.utils.PageUtils;

import java.util.List;
import java.util.Map;

public interface ListPersistenceService {
    public List<PersistenceEntity> listPersistenceDeclare(DomainEntity domainEntity);
}

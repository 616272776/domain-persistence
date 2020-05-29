package com.demo.domain.persistence.persistence.operation.list.api;

import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.utils.PageUtils;

import java.util.List;

public interface ListPersistenceService {

    public PageUtils listPersistence(PersistenceOperationGuide persistenceOperationGuide);
}

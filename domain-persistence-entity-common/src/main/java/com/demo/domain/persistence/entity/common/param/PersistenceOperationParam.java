package com.demo.domain.persistence.entity.common.param;

import com.demo.domain.persistence.entity.common.entity.DomainEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 持久化对象操作生成单元入参
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersistenceOperationParam {

    /**
     * 领域对象
     */
    private DomainEntity domainEntity;

    /**
     * 持久化对象
     */
    private PersistenceEntity persistenceEntity;

    /**
     * 操作描述
     */
    private OperationDescription operationDescription;

    private String domainData;
}

package com.demo.domain.persistence.entity.common.param;

import com.demo.domain.persistence.entity.common.abstracts.AbstractCondition;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import com.demo.domain.persistence.entity.common.enums.OperationTypeEnum;
import lombok.Data;

/**
 * 持久化对象具体操作指导
 * @author Administrator
 */
@Data
public class PersistenceOperationGuide {

    /**
     * 持久化对象
     */
    private PersistenceEntity persistenceEntity;

    /**
     * 操作类型
     */
    private OperationTypeEnum operationTypeEnum;

    /**
     * 具体条件，如查询多少记录，删除的条件，以什么方式删除，修改，先查询，然后修改的值，
     */
    private AbstractCondition condition;

}

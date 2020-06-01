package com.demo.domain.persistence.entity.common.param;

import com.demo.domain.persistence.entity.common.abstracts.AbstractCondition;
import com.demo.domain.persistence.entity.common.enums.OperationTypeEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class OperationDescription implements Serializable {

    // 操作类型
    private OperationTypeEnum operationTypeEnum;

    // 操作条件
    private AbstractCondition abstractCondition;

    // 领域数据
    private String domainData;
}

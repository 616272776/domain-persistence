package com.demo.domain.persistence.entity.common.param;

import com.demo.domain.persistence.entity.common.abstracts.AbstractCondition;
import com.demo.domain.persistence.entity.common.enums.OperationTypeEnum;
import lombok.Data;

@Data
public class OperationDescription {

    private OperationTypeEnum operationTypeEnum;

    private AbstractCondition abstractCondition;
}

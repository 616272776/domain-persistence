package com.demo.domain.persistence.entity.common.param;

import com.demo.domain.persistence.entity.common.abstracts.AbstractCondition;
import lombok.Data;

@Data
public class OperationDescription {

    private int operationType;

    private AbstractCondition abstractCondition;
}

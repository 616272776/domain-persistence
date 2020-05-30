package com.demo.domain.persistence.entity.common.param;

import com.demo.domain.persistence.entity.common.abstracts.AbstractCondition;
import lombok.Data;

@Data
public class SaveCondition extends AbstractCondition {
    private String data;
}

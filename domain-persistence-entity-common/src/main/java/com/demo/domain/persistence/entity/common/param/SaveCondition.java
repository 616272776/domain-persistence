package com.demo.domain.persistence.entity.common.param;

import com.demo.domain.persistence.entity.common.abstracts.AbstractCondition;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SaveCondition extends AbstractCondition implements Serializable {
    /**
     * 保存的生成的持久对象
     */
    private List<Object> generateClass;
}

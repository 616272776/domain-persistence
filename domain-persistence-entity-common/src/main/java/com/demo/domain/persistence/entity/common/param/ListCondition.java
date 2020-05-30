package com.demo.domain.persistence.entity.common.param;

import com.demo.domain.persistence.entity.common.abstracts.AbstractCondition;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询条件实现类
 */
@Data
public class ListCondition extends AbstractCondition {

    Map<String, Object> params = new HashMap<>();


}

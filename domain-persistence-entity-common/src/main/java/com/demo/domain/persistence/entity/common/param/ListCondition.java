package com.demo.domain.persistence.entity.common.param;

import com.demo.domain.persistence.entity.common.abstracts.AbstractCondition;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询条件实现类
 */
public class ListCondition extends AbstractCondition {

    Map<String, Object> params = new HashMap<>();


}

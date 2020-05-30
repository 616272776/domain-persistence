package com.demo.domain.persistence.get.persistence.guide.service.service;

import com.demo.domain.persistence.entity.common.enums.OperationTypeEnum;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationParam;
import com.demo.domain.persistence.get.persistence.guide.api.PersistenceGuideService;
import com.demo.domain.persistence.get.persistence.guide.service.utils.MapperUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
// todo 当前单元就是获取单个持久对象并且映射出操作指导，指导中包括map，和一些信息，到CRUD的单元再生成sql语句
public class PersistenceGuideServiceImpl implements PersistenceGuideService {
    @Override
    public PersistenceOperationGuide getPersistenceOperation(PersistenceOperationParam persistenceOperationParam) {
        // todo 对单个持久化对象操作进行解析返回操作指导
        OperationTypeEnum operationTypeEnum = persistenceOperationParam.getOperationDescription().getOperationTypeEnum();
        Integer relevance = persistenceOperationParam.getPersistenceEntity().getRelevance();
        // 转换json到map
        String domainData = persistenceOperationParam.getDomainData();
        Map<String, Object> map = new HashMap<>();
        try {
            map = MapperUtils.json2map(domainData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // todo 这里判断是直接映射还是，字段映射，如果是字段映射返回的应该是一个集合
        if(relevance==0){
            map = cleanMap(map);
        }else{
            List<Object> Persistence = (List<Object>) map.get(persistenceOperationParam.getPersistenceEntity().getPersistenceClassName());
        }
        return null;
    }

    private Map<String, Object> cleanMap(Map<String, Object> map) {
        return null;
    }

}

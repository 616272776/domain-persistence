package com.demo.domain.persistence.get.persistence.guide.service.service;

import com.demo.domain.persistence.entity.common.abstracts.AbstractCondition;
import com.demo.domain.persistence.entity.common.entity.GenerateClass;
import com.demo.domain.persistence.entity.common.enums.OperationTypeEnum;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.param.PersistenceOperationParam;
import com.demo.domain.persistence.entity.common.param.SaveCondition;
import com.demo.domain.persistence.get.persistence.guide.api.PersistenceGuideService;
import com.demo.domain.persistence.get.persistence.guide.service.utils.MapperUtils;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// todo 当前单元就是获取单个持久对象并且映射出操作指导，指导中包括map，和一些信息，到CRUD的单元再生成sql语句
@Service(version = "1.0.0")
public class PersistenceGuideServiceImpl implements PersistenceGuideService {
    @Override
    public PersistenceOperationGuide getPersistenceOperation(PersistenceOperationParam persistenceOperationParam) {
        // todo 对单个持久化对象操作进行解析返回操作指导
        OperationTypeEnum operationTypeEnum = persistenceOperationParam.getOperationDescription().getOperationTypeEnum();
        Integer relevance = persistenceOperationParam.getPersistenceEntity().getRelevance();
        AbstractCondition abstractCondition = persistenceOperationParam.getOperationDescription().getAbstractCondition();
        List<Object> generateClassList = new ArrayList<>();
        String persistenceClassName = persistenceOperationParam.getPersistenceEntity().getPersistenceClassName();
        String domainData = persistenceOperationParam.getOperationDescription().getDomainData();

        // 转换json到map
        Map<String, Object> map = new HashMap<>();
        try {
            map = MapperUtils.json2map(domainData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 操作类型不同转换不同
        switch (operationTypeEnum.getCode()) {
            case 0: {
                generateClassList = saveOperation(relevance, persistenceClassName, map);
                break;
            }
            case 2: {
                // todo 修改的值如何传入，条件如何传入
//                generateClassList = updateOpertaion(relevance,persistenceClassName,map);
                break;
            }
            case 3: {
                // todo 查询的值如何传入，条件如何传入
                break;
            }
            default: {
                return null;
            }
        }


        // 对生成的对象进行条件映射

        // 返回生成的操作指导
        PersistenceOperationGuide persistenceOperationGuide = new PersistenceOperationGuide();
        persistenceOperationGuide.setPersistenceEntity(persistenceOperationParam.getPersistenceEntity());
        persistenceOperationGuide.setOperationTypeEnum(operationTypeEnum);

        SaveCondition saveCondition = new SaveCondition();
        saveCondition.setGenerateClass(generateClassList);

        persistenceOperationGuide.setCondition(saveCondition);


        return persistenceOperationGuide;
    }

    /**
     * 保存操作的转换
     *
     * @param relevance
     * @param persistenceClassName
     * @param map
     */
    private List<Object> saveOperation(Integer relevance, String persistenceClassName, Map<String, Object> map) {
        List<Object> generateClassList = new ArrayList<>();
        // 这里判断是直接映射还是，字段映射，如果是字段映射返回的应该是一个集合
        if (relevance == 0) {
            map = cleanMap(map);
            GenerateClass clazz = map2Object(map);
            generateClassList.add(clazz.getObject());
        } else {
            List<Map<String, Object>> PersistenceList = (List<Map<String, Object>>) map.get(persistenceClassName);
            PersistenceList.stream().forEach((persistenceItem) -> {
                generateClassList.add(map2Object(persistenceItem).getObject());
            });
        }

        return generateClassList;
    }


    /**
     * 通过map生成相关类,并赋值属性
     *
     * @param map
     * @return
     */
    private GenerateClass map2Object(Map<String, Object> map) {

        // 整理生成类参数
        Map<String, Object> propertyMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            propertyMap.put(entry.getKey(), entry.getValue().getClass());
        }

        // 创建生成类
        GenerateClass sc = new GenerateClass(propertyMap);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sc.setValue(entry.getKey(), entry.getValue());
        }
        return sc;

    }

    /**
     * 将map内是集合的属性移除掉
     *
     * @param map
     * @return
     */
    private Map<String, Object> cleanMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        } else {
            map = map.entrySet().stream()
                    .filter((e) -> {
                        if (e.getValue().getClass().equals(ArrayList.class)) {
                            return false;
                        }
                        return true;
                    })
                    .collect(Collectors.toMap(
                            (e) -> (String) e.getKey(),
                            (e) -> e.getValue()
                    ));
        }
        return map;
    }

}

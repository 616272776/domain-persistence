package com.demo.domain.persistence.persistence.operation.list.service.service;

import com.demo.domain.persistence.entity.common.param.PersistenceOperationGuide;
import com.demo.domain.persistence.entity.common.utils.PageUtils;
import com.demo.domain.persistence.persistence.operation.list.api.ListPersistenceService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class ListPersistenceServiceImpl implements ListPersistenceService {



    @Override
    public PageUtils listPersistence(PersistenceOperationGuide persistenceOperationGuide) {

//        // 获取查询条件
//        ListCondition listCondition = (ListCondition) persistenceOperationGuide.getCondition();
//        // 获取持久类信息
//        PersistenceEntity persistenceEntity = persistenceOperationGuide.getPersistenceEntity();
//
//        switch (persistenceEntity.getPersistenceName()){
//            case "form":{
//                 return daoService.getFormService().queryPage(listCondition.getParams());
//            }
//            case "formItem":{
//                return daoService.getFormItemService().queryPage(listCondition.getParams());
//            }
//            case "template":{
//                return daoService.getTemplateService().queryPage(listCondition.getParams());
//            }
//            case "templateDetail":{
//                return daoService.getTemplateDetailService().queryPage(listCondition.getParams());
//            }
//            case "domain":{
//                return daoService.getDomainService().queryPage(listCondition.getParams());
//            }
//            default:
//                return null;
//        }
        return null;
    }
}

package com.demo.domain.persistence.list.persistence.declare.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.domain.persistence.entity.common.entity.DomainDeclareEntity;
import com.demo.domain.persistence.entity.common.entity.DomainEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceDeclareEntity;

import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import com.demo.domain.persistence.entity.common.utils.PageUtils;
import com.demo.domain.persistence.get.persistence.api.GetPersistenceService;
import com.demo.domain.persistence.list.persistence.declare.api.ListPersistenceService;
import com.demo.domain.persistence.list.persistence.declare.service.service.PersistenceDeclareService;

import com.demo.domain.persistence.mybatis.common.utils.Query;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service(version = "${list-persistence.service.version}")
public class ListPersistenceServiceImpl implements ListPersistenceService {

    @Autowired
    private PersistenceDeclareService persistenceDeclareService;

    @Reference(version = "1.0.0")
    private GetPersistenceService getPersistenceService;

    /**
     * 根据领域说明对象查询持久化对象(组合)
     *
     * @param domainEntity 领域对象
     * @return 持久化对象（组合）
     */
    @Override
    public List<PersistenceEntity> listPersistenceDeclare(DomainEntity domainEntity) {

        // 封装条件
        QueryWrapper<PersistenceDeclareEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("domain_declare_id", domainEntity.getDomainDeclareId());

//        // 查询列表
//        IPage<PersistenceDeclareEntity> page = persistenceDeclareService.page(
//                new Query<PersistenceDeclareEntity>().getPage(params),
//                queryWrapper
//        );

        List<PersistenceDeclareEntity> persistenceDeclareEntityList = persistenceDeclareService.list(queryWrapper);

//        // 根据持久化声明对象查询持久化对象
//        List<PersistenceDeclareEntity> persistenceDeclareEntityList = page.getRecords();
        List<PersistenceEntity> persistenceEntityList = persistenceDeclareEntityList.stream().map((persistenceDeclareEntity -> {

            // 调用查询持久化对象微服务
            PersistenceEntity persistence = getPersistenceService.getPersistence(persistenceDeclareEntity);
            return persistence;
        })).collect(Collectors.toList());
//
//        // 封装查询的结果
//        PageUtils pageUtils = new PageUtils(page);
//        pageUtils.setList(persistenceEntityList);
        return persistenceEntityList;
    }
}

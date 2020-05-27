package com.demo.domain.persistence.get.persistence.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.domain.persistence.entity.common.entity.PersistenceDeclareEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import com.demo.domain.persistence.get.persistence.service.dao.PersistenceDao;
import com.demo.domain.persistence.get.persistence.service.service.PersistenceService;
import org.springframework.stereotype.Service;


@Service("persistenceService")
public class PersistenceServiceImpl extends ServiceImpl<PersistenceDao, PersistenceEntity> implements PersistenceService {


    @Override
    public PersistenceEntity getPersistence(PersistenceDeclareEntity persistenceDeclareEntity) {
        // 封装查询条件
        QueryWrapper<PersistenceEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("persistence_declare_id",persistenceDeclareEntity.getPersistenceDeclareId());

        // 查询持久化对象
        PersistenceEntity persistenceEntity = this.getOne(queryWrapper);

        // 返回持久化对象
        return persistenceEntity;
    }
}
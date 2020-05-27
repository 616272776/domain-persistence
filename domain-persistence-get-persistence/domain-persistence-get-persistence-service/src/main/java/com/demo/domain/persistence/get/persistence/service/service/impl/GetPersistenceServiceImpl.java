package com.demo.domain.persistence.get.persistence.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.domain.persistence.entity.common.entity.PersistenceDeclareEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;
import com.demo.domain.persistence.get.persistence.api.GetPersistenceService;
import com.demo.domain.persistence.get.persistence.service.dao.PersistenceDao;
import com.demo.domain.persistence.get.persistence.service.service.PersistenceService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "${get-persistence.service.version}")
public class GetPersistenceServiceImpl implements GetPersistenceService {

    @Autowired
    private PersistenceService persistenceService;

    @Override
    public PersistenceEntity getPersistence(PersistenceDeclareEntity persistenceDeclareEntity) {

        return persistenceService.getPersistence(persistenceDeclareEntity);
    }
}

package com.demo.domain.persistence.get.persistence.service.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.domain.persistence.entity.common.entity.PersistenceDeclareEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;

/**
 * 
 *
 * @author 
 * @email 
 * @date 2020-05-20 11:20:58
 */
public interface PersistenceService extends IService<PersistenceEntity> {


    PersistenceEntity getPersistence(PersistenceDeclareEntity persistenceDeclareEntity);
}


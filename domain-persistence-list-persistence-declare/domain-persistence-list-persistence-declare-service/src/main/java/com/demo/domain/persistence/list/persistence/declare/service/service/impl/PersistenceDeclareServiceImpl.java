package com.demo.domain.persistence.list.persistence.declare.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.domain.persistence.entity.common.entity.PersistenceDeclareEntity;
import com.demo.domain.persistence.list.persistence.declare.service.dao.PersistenceDeclareDao;
import com.demo.domain.persistence.list.persistence.declare.service.service.PersistenceDeclareService;
import org.springframework.stereotype.Service;


@Service("persistenceDeclareService")
public class PersistenceDeclareServiceImpl extends ServiceImpl<PersistenceDeclareDao, PersistenceDeclareEntity> implements PersistenceDeclareService {

}
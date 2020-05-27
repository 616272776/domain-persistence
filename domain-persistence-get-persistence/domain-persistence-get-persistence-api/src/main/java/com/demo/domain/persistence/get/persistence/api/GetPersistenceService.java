package com.demo.domain.persistence.get.persistence.api;

import com.demo.domain.persistence.entity.common.entity.PersistenceDeclareEntity;
import com.demo.domain.persistence.entity.common.entity.PersistenceEntity;

public interface GetPersistenceService {

    PersistenceEntity getPersistence(PersistenceDeclareEntity persistenceDeclareEntity);
}

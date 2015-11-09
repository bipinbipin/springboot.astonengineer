package com.astontech.astonengineer.services;

import com.astontech.astonengineer.domain.EntityType;
import com.astontech.astonengineer.repositories.EntityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Bipin on 10/15/2015.
 */
@Service
public class EntityTypeServiceImpl implements EntityTypeService {

    @Autowired
    private EntityTypeRepository entityTypeRepository;

    @Override
    public Iterable<EntityType> listAllEntityTypes() {
        return entityTypeRepository.findAll();
    }

    @Override
    public EntityType getEntityTypeById(Integer id) {
        return entityTypeRepository.findOne(id);
    }

    @Override
    public EntityType saveEntityType(EntityType entityType) {
        return entityTypeRepository.save(entityType);
    }

    @Override
    public void deleteEntityType(Integer id) {
        entityTypeRepository.delete(id);
    }

    @Override
    public Iterable<EntityType> findByEntityTypeName(String entityTypeName){
        return entityTypeRepository.findByEntityTypeName(entityTypeName);
    }
}


package com.astontech.astonengineer.services;

import com.astontech.astonengineer.domain.EntityType;

/**
 * Created by Bipin on 10/15/2015.
 */
public interface EntityTypeService {

    Iterable<EntityType> listAllEntityTypes();

    EntityType getEntityTypeById(Integer id);

    EntityType saveEntityType(EntityType entityType);

    void deleteEntityType(Integer id);

    Iterable<EntityType> findByEntityTypeName(String entityTypeName);
}

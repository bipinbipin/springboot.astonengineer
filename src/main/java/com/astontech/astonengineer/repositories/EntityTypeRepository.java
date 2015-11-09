package com.astontech.astonengineer.repositories;

import com.astontech.astonengineer.domain.EntityType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bipin on 10/15/2015.
 */
public interface EntityTypeRepository extends CrudRepository<EntityType, Integer> {

    public Iterable<EntityType> findByEntityTypeName (String EntityTypeName);

}

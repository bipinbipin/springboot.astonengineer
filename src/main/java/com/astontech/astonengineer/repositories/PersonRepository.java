package com.astontech.astonengineer.repositories;

import com.astontech.astonengineer.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bipin on 10/6/2015.
 */
public interface PersonRepository extends CrudRepository<Person, Integer>{
}

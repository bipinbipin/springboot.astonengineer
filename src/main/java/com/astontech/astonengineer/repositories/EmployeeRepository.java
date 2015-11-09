package com.astontech.astonengineer.repositories;

import com.astontech.astonengineer.domain.Employee;
import com.astontech.astonengineer.domain.EntityType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bipin on 10/6/2015.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
}

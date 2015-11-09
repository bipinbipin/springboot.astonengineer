package com.astontech.astonengineer.services;

import com.astontech.astonengineer.domain.Employee;

/**
 * Created by Bipin on 10/6/2015.
 */
public interface EmployeeService {

    Iterable<Employee> listAllEmployees();

    Employee getEmployeeById(Integer id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Integer id);
}

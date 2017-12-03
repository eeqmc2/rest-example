package com.eeqmc2.rest.restexample;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Alex on 3/12/2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}



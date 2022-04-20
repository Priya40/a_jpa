package org.example;

import org.springframework.data.repository.CrudRepository;
import org.h2.Driver;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    List<Employee> findEmployeeByLastName(String str);
}

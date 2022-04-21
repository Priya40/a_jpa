package org.in.sBoot;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> findEmployeeList();

    Employee updateEmployee(Employee employee, Long id);

    void deleteEmployee(Long id);
}

package org.in.sBoot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    //List<Employee> findEmployeeByLastName(String str);

}

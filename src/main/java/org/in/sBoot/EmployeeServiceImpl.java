package org.in.sBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findEmployeeList() {
        System.out.println("in service impl");
        return (List<Employee>)employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee, Long id) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}

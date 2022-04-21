package org.in.sBoot;

import org.in.sBoot.Employee;
import org.in.sBoot.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/employees")
    public Employee SaveEmployee(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }

    @RequestMapping("/")
    public String hello(){
        System.out.println("Trying");
        return "Hello Sachin!";
    }
    @GetMapping("/employees")
    public List<Employee> findEmployeeList(){
        System.out.println("In here?");
        return employeeService.findEmployeeList();
    }

}

package io.github.arvind142.crud_demo.service;

import io.github.arvind142.crud_demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(long employeeId);
    Employee listEmployee(long employeeId);
    List<Employee> listAllEmployees();
}

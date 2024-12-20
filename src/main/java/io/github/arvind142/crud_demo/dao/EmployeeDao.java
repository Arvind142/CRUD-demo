package io.github.arvind142.crud_demo.dao;

import io.github.arvind142.crud_demo.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee saveEmployee(Employee employee);
    void deleteEmployee(long employeeId);
    Employee listEmployee(long employeeId);
    List<Employee> listAllEmployees();
}

package io.github.arvind142.crud_demo.service;

import io.github.arvind142.crud_demo.dao.EmployeeDao;
import io.github.arvind142.crud_demo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao){
        this.employeeDao=employeeDao;
    }

    @Override
    @Transactional
    public Employee createEmployee(Employee employee) {
        return employeeDao.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee updateEmployee(Employee employee) {
        return employeeDao.saveEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(long employeeId) {
        employeeDao.deleteEmployee(employeeId);
    }

    @Override
    public Employee listEmployee(long employeeId) {
        return employeeDao.listEmployee(employeeId);
    }

    @Override
    public List<Employee> listAllEmployees() {
        return employeeDao.listAllEmployees();
    }
}

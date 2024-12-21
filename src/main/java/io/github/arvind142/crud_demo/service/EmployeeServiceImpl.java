package io.github.arvind142.crud_demo.service;

import io.github.arvind142.crud_demo.dao.EmployeeDao;
import io.github.arvind142.crud_demo.dao.EmployeeRepository;
import io.github.arvind142.crud_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Service
public class EmployeeServiceImpl /*implements EmployeeService */{
////    private EmployeeDao employeeDao;
////    public EmployeeServiceImpl(EmployeeDao employeeDao){
////        this.employeeDao=employeeDao;
////    }
//
//    EmployeeRepository employeeRepository;
//
//    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
//        this.employeeRepository = employeeRepository;
//    }
//
//    @Override
//    @Transactional
//    public Employee createEmployee(Employee employee) {
////        return employeeDao.saveEmployee(employee);
//        return employeeRepository.save(employee);
//    }
//
//    @Override
//    @Transactional
//    public Employee updateEmployee(Employee employee) {
////        return employeeDao.saveEmployee(employee);
//        return employeeRepository.save(employee);
//    }
//
//    @Override
//    @Transactional
//    public void deleteEmployee(long employeeId) {
////        employeeDao.deleteEmployee(employeeId);
//        employeeRepository.deleteById(employeeId);
//    }
//
//    @Override
//    public Employee listEmployee(long employeeId) {
////        return employeeDao.listEmployee(employeeId);
//        return employeeRepository.findById(employeeId).orElse(null);
//    }
//
//    @Override
//    public List<Employee> listAllEmployees() {
////        return employeeDao.listAllEmployees();
//        return employeeRepository.findAll();
//    }
}

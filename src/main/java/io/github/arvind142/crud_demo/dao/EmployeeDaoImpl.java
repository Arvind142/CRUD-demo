package io.github.arvind142.crud_demo.dao;

import io.github.arvind142.crud_demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    private EntityManager entityManager;

    public EmployeeDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        employee = entityManager.merge(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(long employeeId) {
        Employee employee = entityManager.find(Employee.class,employeeId);
        entityManager.remove(employee);
    }

    @Override
    public Employee listEmployee(long employeeId) {
        return entityManager.find(Employee.class,employeeId);
    }

    @Override
    public List<Employee> listAllEmployees() {
        TypedQuery<Employee> typedQuery = entityManager.createNamedQuery("employee.listAllEmployees",Employee.class);
        return typedQuery.getResultList();
    }
}

package io.github.arvind142.crud_demo.dao;

import io.github.arvind142.crud_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}

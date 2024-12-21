package io.github.arvind142.crud_demo.dao;

import io.github.arvind142.crud_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members ")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}

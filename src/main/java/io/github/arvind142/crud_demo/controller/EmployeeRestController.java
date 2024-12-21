package io.github.arvind142.crud_demo.controller;

import io.github.arvind142.crud_demo.entity.Employee;
import io.github.arvind142.crud_demo.execption.EmployeeException;
import io.github.arvind142.crud_demo.service.EmployeeServiceImpl;
import jdk.jfr.ContentType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/employees")
public class EmployeeRestController {

//    private EmployeeServiceImpl employeeServiceImpl;
//
//    public EmployeeRestController(EmployeeServiceImpl EmployeeServiceImpl){
//        this.employeeServiceImpl = EmployeeServiceImpl;
//    }
//
//    @RequestMapping("/hello")
//    public String sayHello(){
//        return "Hello";
//    }
//
//    @RequestMapping(path = "/{employeeID}", method = RequestMethod.GET)
//    public Employee getEmployee(@PathVariable long employeeID){
//        Employee employee = employeeServiceImpl.listEmployee(employeeID);
//        if(employee==null){
//            throw new EmployeeException("No Employee Found!!",HttpStatus.NOT_FOUND);
//        }
//        return employee;
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public List<Employee> getAllEmployees(){
//        return employeeServiceImpl.listAllEmployees();
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
//    public Employee createEmployee(@RequestBody Employee employee){
//        if(employee.getId()!=0){
//            throw new EmployeeException("Id should not exists when performing create user, ID is always auto generated.",HttpStatus.BAD_REQUEST);
//        }
//        return employeeServiceImpl.createEmployee(employee);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT)
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public Employee updateEmployee(@RequestBody Employee employee){
//        return employeeServiceImpl.updateEmployee(employee);
//    }
//
//    @RequestMapping(path = "/{employeeID}", method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public String deleteEmployee(@PathVariable Long employeeID){
//        // method call to get employee would be processed without any issue if user exists else it would throw error saying employee doesn't exist.
//        Employee employee = getEmployee(employeeID);
//        employeeServiceImpl.deleteEmployee(employeeID);
//        return "{\"message\": \" Employee: "+employeeID+" deleted from database\"}";
//    }
}

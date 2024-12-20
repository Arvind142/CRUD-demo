package io.github.arvind142.crud_demo.controller;

import io.github.arvind142.crud_demo.execption.EmployeeException;
import io.github.arvind142.crud_demo.entity.EmployeeExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@ControllerAdvice
public class EmployeeControllerAdvice {

    private SimpleDateFormat simpleDateFormat;

    public EmployeeControllerAdvice(SimpleDateFormat simpleDateFormat){
        this.simpleDateFormat=simpleDateFormat;
    }

    @ExceptionHandler(EmployeeException.class)
    public ResponseEntity<EmployeeExceptionResponse> returnResponse(EmployeeException ex){
        EmployeeExceptionResponse employeeExceptionResponse = new EmployeeExceptionResponse(ex.getMessage(), simpleDateFormat.format(Calendar.getInstance().getTime()),ex.getHttpStatus());
        return new ResponseEntity<EmployeeExceptionResponse>(employeeExceptionResponse,employeeExceptionResponse.getHttpStatus());
    }

}

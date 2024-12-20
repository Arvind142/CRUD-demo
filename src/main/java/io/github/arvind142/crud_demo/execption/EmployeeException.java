package io.github.arvind142.crud_demo.execption;

import org.springframework.http.HttpStatus;

public class EmployeeException extends RuntimeException{
    HttpStatus httpStatus;
    public EmployeeException(String message,HttpStatus status){
        super(message);
        this.httpStatus=status;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}

package io.github.arvind142.crud_demo.entity;

import org.springframework.http.HttpStatus;

public class EmployeeExceptionResponse {
    private String message = "";
    private String dateTime = "";
    private HttpStatus httpStatus;

    public EmployeeExceptionResponse(String message, String dateTime,HttpStatus httpStatus) {
        this.message = message;
        this.dateTime = dateTime;
        this.httpStatus=httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}

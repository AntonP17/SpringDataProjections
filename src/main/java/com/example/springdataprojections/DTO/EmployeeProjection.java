package com.example.springdataprojections.DTO;


import com.fasterxml.jackson.annotation.JsonIgnore;

public interface EmployeeProjection {

    @JsonIgnore
    String getFirstName();
    @JsonIgnore
    String getLastName();
    String getPosition();
    String getDepartmentName();

    default String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}

package com.ciceniclabs.employeecrudapp.service;

import com.ciceniclabs.employeecrudapp.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

}

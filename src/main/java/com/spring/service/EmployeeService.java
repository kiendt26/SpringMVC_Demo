package com.spring.service;

import com.spring.dao.EmployeeDAO;
import com.spring.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeDAO.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> existingEmployee = employeeDAO.findById(id);
        if (existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName());
            updatedEmployee.setEmail(employee.getEmail());
            updatedEmployee.setDepartment(employee.getDepartment());
            return employeeDAO.save(updatedEmployee);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        employeeDAO.deleteById(id);
    }
}

package com.example.EMS.service;

import com.example.EMS.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    void updateEmployee(Employee employee);

    Employee getEmployeeById(Long id);
    void deleteEmployee(Long id);
    Page<Employee> findPageinated(int pageNo,int pageSize);
}

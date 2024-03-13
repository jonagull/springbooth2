package com.example.springh2.service;

// Importing required classes
import com.example.springh2.entity.Department;

import java.util.List;

// Interface
public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);

    Department findDepartmentById(Long departmentId);


    // Delete operation
    void deleteDepartmentById(Long departmentId);
}

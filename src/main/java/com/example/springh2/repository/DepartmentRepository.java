package com.example.springh2.repository;

import com.example.springh2.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository
        extends CrudRepository<Department, Long> {
}

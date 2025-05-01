package com.manic.springcrud.repository;

import com.manic.springcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepsitory extends JpaRepository<Employee,Long> {
    //crud
}

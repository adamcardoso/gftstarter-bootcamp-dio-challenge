package com.challenge.userdeptarment.repositories;

import com.challenge.userdeptarment.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

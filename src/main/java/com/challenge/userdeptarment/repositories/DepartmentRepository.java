package com.challenge.userdeptarment.repositories;

import com.challenge.userdeptarment.entities.Departament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Departament, Long> {
}

package com.challenge.userdeptarment.controllers;

import com.challenge.userdeptarment.entities.Department;
import com.challenge.userdeptarment.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/depts")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Department findAll(@PathVariable Long id){
        return departmentRepository.findById(id).get();
    }

    @PostMapping
    public Department inser(@RequestBody Department dept){
        return departmentRepository.save(dept);
    }
}

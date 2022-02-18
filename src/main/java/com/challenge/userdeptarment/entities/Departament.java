package com.challenge.userdeptarment.entities;

public class Departament {
    private Long id;
    private String departmentName;

    public Departament(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

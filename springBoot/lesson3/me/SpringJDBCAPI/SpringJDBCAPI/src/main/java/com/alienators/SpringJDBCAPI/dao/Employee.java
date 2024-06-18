package com.alienators.SpringJDBCAPI.dao;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private Integer id;
    private String city;
    private String name;
    private Double salary;

    public Employee() {
        System.out.println("Employee bean created");;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", city=" + city + ", name=" + name + ", salary=" + salary + "]";
    }

}

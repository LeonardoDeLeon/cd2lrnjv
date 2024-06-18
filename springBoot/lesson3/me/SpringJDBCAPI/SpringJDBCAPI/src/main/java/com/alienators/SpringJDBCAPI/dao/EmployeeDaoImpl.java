package com.alienators.SpringJDBCAPI.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDaoImpl implements IEmployeePersistency {
    private static final String SQL_QUERY = "select * from employee";
    List<Employee> employees;
    
    @Autowired
    private DataSource dataSource;

    public EmployeeDaoImpl() {
        super();
        System.out.println("EmployeeDaoImpl bean is created");
    }

    @Override
    public List<Employee> getEmployeesData() {
        try {
            Connection conn=dataSource.getConnection();
            System.out.println("Connection comes from this class -> "+conn.getClass().getName());
            PreparedStatement pstmt=conn.prepareStatement(SQL_QUERY);
            ResultSet rs=pstmt.executeQuery();
            employees=new ArrayList<>();
            while(rs.next()){
                Employee emp=new Employee();
                emp.setId(rs.getInt(1));
                emp.setCity(rs.getString(2));
                emp.setName(rs.getString(3));
                emp.setSalary(rs.getDouble(4));
                employees.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
    
}

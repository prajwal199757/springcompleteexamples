package com.example.demo.service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao edao;

    public ArrayList<Employee> getAllEmps() {
        return edao.getAllEmps();
    }

    public ArrayList<Employee> insertEmp(Employee e) {
        return edao.insertEmp(e);
    }

    public ArrayList<Employee> deleteById(int id) {
        return edao.deleteById(id);
    }
}

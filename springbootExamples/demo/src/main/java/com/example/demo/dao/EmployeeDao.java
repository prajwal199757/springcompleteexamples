package com.example.demo.dao;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeDao {
    ArrayList<Employee> emps = new ArrayList<Employee>();

    public EmployeeDao(){
        this.emps.add(new Employee(1,"John",34));
        this.emps.add(new Employee(2,"Michael",45));
    }

    public ArrayList<Employee> getAllEmps(){
        return this.emps;
    }

    public ArrayList<Employee> insertEmp(Employee e){
        this.emps.add(e);
        return this.emps;
    }

    public ArrayList<Employee> deleteById(int id){
        for(int i = 0; i<this.emps.size(); i++){
            if(id == this.emps.get(i).getId()){
                this.emps.remove(i);
                break;
            }
        }
        return this.emps;
    }
}

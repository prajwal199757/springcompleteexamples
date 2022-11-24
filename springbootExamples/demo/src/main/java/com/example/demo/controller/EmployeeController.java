package com.example.demo.controller;


import com.example.demo.exceptions.NoEmployeesException;
import com.example.demo.exceptions.RecordNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService eservice;

    //Sending Data to client and Content Negotiation using Accept header
    @RequestMapping(value="/emps",
            produces={MediaType.APPLICATION_XML_VALUE})
    public ArrayList<Employee> printEmp(){
        ArrayList<Employee> emps =  eservice.getAllEmps();

        if(emps.size() == 0){
            //throw new NoEmployeesException();
            throw new RecordNotFoundException();
        }
        return emps;
    }

    //Receiving data from client
    @RequestMapping(value="/emps",
            method= RequestMethod.POST,
            consumes={MediaType.APPLICATION_JSON_VALUE},
            produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<Employee> addEmp(@RequestBody Employee e){
        return eservice.insertEmp(e);
    }

    @DeleteMapping("/emps/{eid}")
    public ArrayList<Employee> deleteById(@PathVariable("eid") int id){
        return eservice.deleteById(id);
    }

}

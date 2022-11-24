package com.example.mongoexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BANK-INFO")
public class Bank {
    @Id
    private int id;
    private String ifscCode;
    private String name;
    private String branch;

    public Bank(int id, String ifscCode, String name, String branch) {
        this.id = id;
        this.ifscCode = ifscCode;
        this.name = name;
        this.branch = branch;
    }

    public Bank()
    {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", ifscCode='" + ifscCode + '\'' +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}

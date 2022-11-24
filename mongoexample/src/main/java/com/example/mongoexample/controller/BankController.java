package com.example.mongoexample.controller;

import com.example.mongoexample.model.Bank;
import com.example.mongoexample.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BankController {
    @Autowired
    private BankService bankService;

    @GetMapping("/banks")
    public List<Bank> getBanks() {
        return bankService.getBanks();
    }

    @GetMapping("/banks/{id}")
    public Optional<Bank> getBank(@PathVariable int id) {
        return bankService.findById(id);
    }

    @GetMapping("/bank/{name}")
    public List<Bank> getBankByName(@PathVariable String name) {
        return bankService.getBankByName(name);
    }

    @PostMapping("/banks")
    public Bank createBank(@RequestBody Bank bank)
    {
        return bankService.createBank(bank);
    }

    @PutMapping("/banks/{id}")
    public Bank updateBank(@RequestBody Bank newBank, @PathVariable int id)
    {
        return bankService.updateBank(newBank);
    }

    @DeleteMapping("/banks/{id}")
    public void deleteBank(@PathVariable int id) {
        bankService.deleteBank(id);
    }

}

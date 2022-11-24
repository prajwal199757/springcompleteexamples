package com.example.mongoexample.service;

import com.example.mongoexample.model.Bank;
import com.example.mongoexample.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    public List<Bank> getBanks() {
        return bankRepository.findAll();
    }

    public Bank createBank(Bank bank) {
        return (Bank) bankRepository.save(bank);
    }

    public Bank updateBank(Bank newBank) {
        return (Bank) bankRepository.save(newBank);
    }

    public void deleteBank(int id) {
         bankRepository.deleteById(id);
    }

    public Optional<Bank> findById(int id) {
        return bankRepository.findById(id);
    }

    public List<Bank> getBankByName(String name) {
//        return bankRepository.findByName(name);
        List<Bank> listOfBank = bankRepository.findByName(name);
        return listOfBank;
    }
}


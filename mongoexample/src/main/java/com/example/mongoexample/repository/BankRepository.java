package com.example.mongoexample.repository;

import com.example.mongoexample.model.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankRepository extends MongoRepository<Bank, Integer> {
    List<Bank> findByName(String name);
}

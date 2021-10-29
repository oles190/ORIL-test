package com.example.demo.repository;

import com.example.demo.dto.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface PriceRepository extends JpaRepository<Price, String> {

    Price findByCurr1(String curr1);



}

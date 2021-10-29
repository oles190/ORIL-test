package com.mongo.spring.repository;


import com.mongo.spring.model.Price;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
public interface PriceRepository extends MongoRepository<Price, Integer> {

 public List<Price> findAllByCurr1(String curr1);
 List<Price> findFirst10By();



}
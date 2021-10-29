package com.example.demo.controller;


import com.example.demo.dto.Price;
import com.example.demo.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

List<Integer> list = new ArrayList<>(Arrays.asList(23,34,43,23));
    private PriceRepository repository;


    @Autowired
    public TestController(PriceRepository repository) {
        this.repository = repository;
    }





    @GetMapping("/{curr1}")
    public Price test(@PathVariable("curr1") String curr1){
       Price price=  repository.findByCurr1(curr1);
       return  price;

    }

    @GetMapping("/all")
    public List<Price> findAll(){
        List<Price> lists= repository.findAll();
        return lists;

    }

}

package com.mongo.spring.controller;

import com.mongo.spring.model.Price;
import com.mongo.spring.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class PriceController {


    private PriceRepository repository;

    @Autowired
    public PriceController(PriceRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/all/{name}")
    public List<Price> findAll(@PathVariable String name) {
        List<Price> lists = repository.findAllByCurr1(name);
       if(!lists.isEmpty()){
           return lists;
       }else{
           throw new NullPointerException();
       }

    }

    @GetMapping("/cryptocurrenci/minprice/{name}")
    public Object minPrice(@PathVariable String name) {

        List<Price> list = repository.findAllByCurr1(name);

        if(list.isEmpty()){
            throw new  NullPointerException();
        }

        int i = 1;
        double curent = list.get(i++).getLprice();
        double min = 0;

        for (Price one : list) {

            if (curent > one.getLprice()) {
                min = one.getLprice();
                curent = min;
            }

        }
        return min;


    }


    @GetMapping("/cryptocurrenci/maxprice/{name}")
    public Object maxPrice(@PathVariable String name) {

        List<Price> list = repository.findAllByCurr1(name);


        if(list.isEmpty()){
            throw new  NullPointerException();
        }

        int i = 1;
        double curent = list.get(i++).getLprice();
        double max = 0;

        for (Price one : list) {

            if (curent < one.getLprice()) {
                max = one.getLprice();
                curent = max;
            }

        }
        return max;
    }




    @GetMapping("/cryptocurrencies/page/size")
    public List<Price> sort(){
        List<Price> list =repository.findFirst10By();
        Collections.sort(list);
        return list;


    }
}




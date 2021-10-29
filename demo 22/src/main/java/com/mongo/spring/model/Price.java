package com.mongo.spring.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import lombok.Data;


@AllArgsConstructor

@NoArgsConstructor
@Data
public class Price implements  Comparable<Price>{

//   @Id
//   private int id;

    public Price( Double lprice, String curr1, String curr2) {
        this.lprice = lprice;
        this.curr1 = curr1;
        this.curr2 = curr2;
    }

    private Long createdAt;
    private  Double lprice;
    private  String curr1;
    private  String curr2;

    @Override
    public int compareTo(Price o) {
        return this.lprice.compareTo(o.getLprice());
    }
}
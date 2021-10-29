package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor

@NoArgsConstructor
@Data
@Entity
@Table(name="price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Long createdAt;
    private  Double lprice;
    private  String curr1;
    private  String curr2;
}
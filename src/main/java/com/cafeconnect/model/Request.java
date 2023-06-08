package com.cafeconnect.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String quantity;
    private String price;
    private String category;
    private String image;

    private String onDate;
    private String orderTime;
    private  String requestTime;
    private String acceptTime="";

    private String totalAmount;

    private String cafeEmail;

    private String studentEmail;

    private boolean isAccepted=false;
}

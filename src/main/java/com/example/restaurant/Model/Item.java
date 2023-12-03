package com.example.restaurant.Model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Item extends BaseEntity{

    private  String img;
    private int Quantity;
    private  int price;
    @ManyToOne
    @JoinColumn(name = "request_order")
    private RequestOrder requestOrder;
}

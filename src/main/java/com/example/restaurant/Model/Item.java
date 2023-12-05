package com.example.restaurant.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item")
public class Item extends BaseEntity{
@Column(name = "image")
    private  String img;
@Column(name = "quantity")
    private int Quantity;
@Column(name = "price")
    private  int price;
    @ManyToOne
    @JoinColumn(name = "request_order")
    private RequestOrder requestOrder;
}

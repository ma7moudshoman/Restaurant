package com.example.restaurant.Entity;

import com.example.restaurant.Model.Address;
import com.example.restaurant.Model.Client;
import com.example.restaurant.Model.Item;
import com.example.restaurant.Model.RequestOrder;
import lombok.Data;

import java.util.List;
@Data
public class PurchaseRequest {
    private Client client;
    private RequestOrder requestOrder;
    private List<Item>items;
    private Address fromAddress;
    private Address toAddress;
}

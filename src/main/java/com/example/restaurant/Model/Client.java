package com.example.restaurant.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client")
public class Client extends PublicData{
    @Column(name = "email")
    private String email;
    @Column(name = "Phone_number")
    private String phoneNumber;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "client")
    private Set<RequestOrder>requestOrders=new HashSet<>();
    private void addRequestOrder(RequestOrder requestOrder){
        requestOrders.add(requestOrder);
        requestOrder.setClient(this);
    }

}

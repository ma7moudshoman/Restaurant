package com.example.restaurant.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class RequestOrder extends CategoryOrder{
@Column(name = "code")
private  String code;
@Column(name = "total_price")
private int totalPrice;
@Column(name = "total_quantity")
private int totalQuantity;

@OneToMany(cascade = CascadeType.ALL,mappedBy = "requestOrder")
private List<Item> items =new ArrayList<>();

@ManyToOne
@JoinColumn(name = "client_id")
private Client client=new Client();

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "to_address_id",referencedColumnName = "id")
private Address address =new Address();

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "from_address_id",referencedColumnName = "id")
private Address fromAddress=new Address();

public void addItem(Item item){
    item.add(item);
    item.setRequestOrdeer(this);
}



}

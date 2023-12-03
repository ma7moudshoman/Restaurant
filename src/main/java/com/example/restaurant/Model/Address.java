package com.example.restaurant.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class Address extends CategoryOrder {
 @Column(name = "country")
    private String country;
 @Column(name = "state")
    private String state;
 @Column(name = "zi_pcode")
    private String zipCode;

 @OneToOne
 @PrimaryKeyJoinColumn
private RequestOrder requestOrder;


}

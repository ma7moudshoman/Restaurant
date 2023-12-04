package com.example.restaurant.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "orders")
public class Order extends PublicData{
    @Column(name = "price")
    private int price;
    @Column(name = "image")
    private  String img;
    @Column(name = "description")
    @Lob
    private String description;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;




}

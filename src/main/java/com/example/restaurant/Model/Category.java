package com.example.restaurant.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = " category")
public class Category extends CategoryOrder{

    @JsonIgnore

    @OneToMany(mappedBy = "category")
    private Set<Order>orders;

    @Column(name = "Order")
    private String loge;

    @Column(name = "name")
    private String name;
}

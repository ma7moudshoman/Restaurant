package com.example.restaurant.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class CategoryOrder extends BaseEntity {
    @Column(name = "date_creat")
@CreationTimestamp
    private Date dateCreat;
    @Column(name = "date_update")
    @CreationTimestamp
    private Date dateapdate;

}

package com.example.restaurant.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User extends BaseEntity{
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    public String password;
@Column(name = "active")
    private int active;

@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(name = "user_role",
        joinColumns = {@JoinColumn(name = "user_id")},
        inverseJoinColumns = {@JoinColumn(name = "authorities_id")})
private Set<Authorities> authorities=new HashSet<>();


}

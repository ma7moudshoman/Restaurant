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
@Data
@NoArgsConstructor
@Entity
@Table(name = "country")
public class Country extends PublicData {

@Column(name = "code")
    private String code;

@JsonIgnore
@OneToMany(mappedBy = "country")
    private Set<State> states;

}

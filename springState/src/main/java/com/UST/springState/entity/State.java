package com.UST.springState.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class State {
    @Id
    @GeneratedValue
    private int id;
    private String stateName;
    @OneToMany(mappedBy = "state")
    private List<District> districts;

}

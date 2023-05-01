package com.hernan.pokemonApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Habilitie {

    @Id
    private Integer id;
    private Boolean is_hidden;

    private Integer slot;


    private String name;
}

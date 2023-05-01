package com.hernan.pokemonApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pokemon {

    @Id
    private Integer id;

    private String name;

    private Integer base_experience;

    private Integer height;


    @OneToMany(targetEntity = Habilitie.class)
    private List<Habilitie> habilities;
}

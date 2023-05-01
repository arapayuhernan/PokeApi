package com.hernan.pokemonApi.dto;

import lombok.Data;
import java.util.List;


@Data
public class PokemonDto {

    private Integer id;

    private String name;

    private Integer base_experience;

    private Integer height;


    private List<HabilitieDto> habilities;
}

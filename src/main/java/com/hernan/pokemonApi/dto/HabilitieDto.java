package com.hernan.pokemonApi.dto;

import lombok.Data;

@Data
public class HabilitieDto {

    private Integer id;

    private Boolean is_hidden;

    private Integer slot;


    private String name;
}

package com.alkemy.disney.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class PersonageDto implements Serializable {
    private final Long id;
    private final String name;
    private final String history;
    private final String imgUrl;
    private final Short age;
    private final Short weight;
    private final Set<FilmDto> filmsDto;
}

package com.jadnobarbosa.ramengo.order.dto;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@SuperBuilder
public class Ingredient {

    private Integer id;
    private String imageInactive;
    private String imageActive;
    private String name;
    private String description;
    private BigDecimal price;

}

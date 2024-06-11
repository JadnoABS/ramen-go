package com.jadnobarbosa.ramengo.order.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {

    private String id;
    private String imageInactive;
    private String imageActive;
    private String name;
    private String description;
    private int price;

}

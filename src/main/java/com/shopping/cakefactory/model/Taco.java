package com.shopping.cakefactory.model;

/**
 * Created by asamba on 6/20/20.
 */
import lombok.Data;

import java.util.List;

@Data
public class Taco {

    private String name;
    private List<String> ingredients;

}
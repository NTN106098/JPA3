package com.axonactive.com.Controller.Request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CoffeeRequest {
    @NotNull
    private String code;
    private String name;
    private String type;


}

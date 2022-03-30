package com.axonactive.com.Controller.Request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
public class CustomerCoffeeRequest {
    @NotNull
    private LocalDate buyDate;
    private Integer quantity;
    private Integer price;
    private Integer customerId;
    private Integer code;
}

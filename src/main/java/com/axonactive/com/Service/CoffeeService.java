package com.axonactive.com.Service;

import com.axonactive.com.Controller.Request.CoffeeRequest;
import com.axonactive.com.Entity.Coffee;

import java.util.List;

public interface CoffeeService {
    List<Coffee> getAllCoffee();
    Coffee addCoffee(CoffeeRequest coffeeRequest);
    Coffee getCoffeeById(int id);
    Coffee updateCoffeeById(int id, CoffeeRequest coffeeRequest);
    void  deleteCoffeById(int id);
}

package com.axonactive.com.Service.Impl;

import com.axonactive.com.Controller.Request.CoffeeRequest;
import com.axonactive.com.Entity.Coffee;
import com.axonactive.com.Service.CoffeeService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Objects;

public class CoffeeServiceIml implements CoffeeService {
    @PersistenceContext(unitName = "coffeedb")
    private EntityManager em;

    @Override
    public List<Coffee> getAllCoffee() {
   //         return em.createQuery("SELECT c FROM Coffee c", Coffee.class).getResultList();
        return em.createQuery(Coffee.GET_ALL,Coffee.class).getResultList();

    }

    @Override
    public Coffee addCoffee(CoffeeRequest coffeeRequest) {
        Coffee coffee = new Coffee();
        coffee.setCode(coffeeRequest.getCode());
        coffee.setName(coffeeRequest.getName());
        coffee.setType(coffeeRequest.getType());

        em.persist(coffee);
        return coffee;
    }

    @Override
    public Coffee getCoffeeById(int id) {
        return em.createQuery(Coffee.GET_COFFEE_BY_ID,Coffee.class ).setParameter("id",id).getSingleResult();
    }

    @Override
    public Coffee updateCoffeeById(int id, CoffeeRequest coffeeRequest) {
        Coffee coffee = getCoffeeById(id);
        coffee.setName(coffeeRequest.getName());
        coffee.setType(coffeeRequest.getType());

        em.remove(coffee);
        return coffee;
    }

    @Override
    public void deleteCoffeById(int id) {
        Coffee coffee = em.find(Coffee.class,id);
        if(!Objects.isNull(coffee)) {
            em.remove(coffee);
        }
    }
}

package com.axonactive.com.Service.Impl;

import com.axonactive.com.Entity.CustomerCoffee;
import com.axonactive.com.Service.CustomerCoffeeService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RequestScoped
@Transactional
public class CustomerCoffeeServiceImpl implements CustomerCoffeeService {

    @PersistenceContext(unitName = "coffedb")
    private EntityManager em;
    @Inject
    CustomerCoffeeService customerCoffeeService;

    @Override
    public List<CustomerCoffee> getAllCustomerCoffee() {
        return null;
    }
}

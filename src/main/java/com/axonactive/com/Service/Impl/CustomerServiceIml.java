package com.axonactive.com.Service.Impl;

import com.axonactive.com.Controller.Request.CustomerRequest;
import com.axonactive.com.Entity.Customer;
import com.axonactive.com.Service.CustomerService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Objects;

public class CustomerServiceIml implements CustomerService {
    @PersistenceContext(unitName = "coffeedb")
    private EntityManager entityManager;
    @Override
    public Customer getCustomerById(int id) {

//        return entityManager.find(Customer.class, id) ;
        return  entityManager.createNamedQuery(Customer.GET_BY_ID,Customer.class).setParameter("id",id).getSingleResult();
    }

    @Override
    public List<Customer> getAllCustomer() {
//        return entityManager.createQuery("SELECT c FROM Customer c",Customer.class).getResultList();
        return entityManager.createNamedQuery(Customer.GET_ALL_CUSTOMER, Customer.class).getResultList();
    }



    @Override
    public Customer addCustomer(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setFirstName(customerRequest.getFirstName());
        customer.setLastName(customerRequest.getLastName());
        customer.setCity(customerRequest.getCity());
        customer.setEmail(customerRequest.getEmail());
        customer.setGender(customerRequest.getGender());
        customer.setPhone(customerRequest.getPhone());

        entityManager.persist(customer);
        return customer;
    }

    @Override
    public Customer updateCustomerById(int id, CustomerRequest customerRequest) {
        Customer customer = getCustomerById(id);
        customer.setGender(customerRequest.getGender());
        customer.setPhone(customerRequest.getPhone());
        customer.setFirstName(customerRequest.getFirstName());
        customer.setLastName(customerRequest.getLastName());
        customer.setCity(customerRequest.getCity());
        customer.setEmail(customerRequest.getEmail());

        entityManager.remove(customer);
        return customer;
    }

    @Override
    public void deleteCustomerById(int id) {
        Customer customer = entityManager.find(Customer.class, id);
        if(!Objects.isNull(customer)){
            entityManager.remove(customer);
        }
    }

    @Override
    public List<Customer> getCustomerByMonth(int month) {
        return null;
    }
}

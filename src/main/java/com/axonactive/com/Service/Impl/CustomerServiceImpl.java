package com.axonactive.com.Service.Impl;

import com.axonactive.com.Controller.Request.CustomerRequest;
import com.axonactive.com.Entity.Customer;
import com.axonactive.com.Service.CustomerService;
import com.axonactive.com.persistence.AbstractCRUDBean;
import com.axonactive.com.persistence.PersistenceService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@RequestScoped
@Transactional
public class CustomerServiceImpl extends AbstractCRUDBean<Customer> {
    @Inject
    PersistenceService<Customer> persistenceService;

    @Override
    protected PersistenceService<Customer> getPersistenceService() {
        return persistenceService;
    }


//    @PersistenceContext(unitName = "coffedb")
//    private EntityManager em;


    //    @Override
//    public Customer getCustomerById(int id) {
//        return em.find(Customer.class,id);
//    }
//
//    @Override
    public List<Customer> getAllCustomer() {
        return persistenceService.createQuery("SELECT c FROM Customer c").getResultList();
    }

    //
//    @Override
    public Customer addCustomer(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setFirstName(customerRequest.getFirstName());
        customer.setLastName(customerRequest.getLastName());
        customer.setDateOfBirth(customerRequest.getDateOfBirth());
        customer.setGender(customerRequest.getGender());
        customer.setPhone(customerRequest.getPhone());
        customer.setCity(customerRequest.getCity());
        customer.setEmail(customerRequest.getEmail());
        save(customer);
//         em.persist(customer);
        return customer;
    }

    //
//    @Override
    public Customer updateCustomerById(int id, CustomerRequest customerRequest) {
//        Customer customer = getCustomerById(id);
        Customer customer = findById(id);
        customer.setFirstName(customerRequest.getFirstName());
        customer.setLastName(customerRequest.getLastName());
        customer.setDateOfBirth(customerRequest.getDateOfBirth());
        customer.setGender(customerRequest.getGender());
        customer.setPhone(customerRequest.getPhone());
        customer.setCity(customerRequest.getCity());
        customer.setEmail(customerRequest.getEmail());

//        em.merge(customer);
        update(customer);
        return customer;
//    }
//
//    @Override
//    public void deleteCustomerById(int id) {
//        Customer customer = em.find(Customer.class, id);
//        if (!Objects.isNull(customer)) {
//            em.remove(customer);
//        }
//    }


    }
}

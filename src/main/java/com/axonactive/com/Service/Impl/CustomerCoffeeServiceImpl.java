//package com.axonactive.com.Service.Impl;
//
//import com.axonactive.com.Controller.Request.CustomerCoffeeRequest;
//import com.axonactive.com.Entity.Coffee;
//import com.axonactive.com.Entity.Customer;
//import com.axonactive.com.Entity.CustomerCoffee;
//import com.axonactive.com.Service.CustomerCoffeeService;
//import com.axonactive.com.Service.CustomerService;
//
//import javax.enterprise.context.RequestScoped;
//import javax.inject.Inject;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.persistence.TypedQuery;
//import javax.transaction.Transactional;
//import java.util.List;
//import java.util.Objects;
//
//@RequestScoped
//@Transactional
//public class CustomerCoffeeServiceImpl implements CustomerCoffeeService {
//
//
//
//    @PersistenceContext(unitName = "coffedb")
//    private EntityManager em;
//
//
//    @Override
//    public List<CustomerCoffee> getAllCustomerCoffeeByCustomer() {
////        return em.createQuery(" FROM CustomerCoffee", CustomerCoffee.class).getResultList();
//        return  em.createNamedQuery(CustomerCoffee.GET_ALL,CustomerCoffee.class).getResultList();
//    }
//
//    @Override
//    public CustomerCoffee getCustomerCoffeeById(int id) {
//        return em.find(CustomerCoffee.class,id);
////        return  em.createNamedQuery(CustomerCoffee.GET_BY_ID,CustomerCoffee.class).setParameter("id", id).getSingleResult();
//    }
//
//    @Override
//    public CustomerCoffee addCustomerCoffee(CustomerCoffeeRequest customerCoffeeRequest) {
//        Customer customer = em.find(Customer.class, customerCoffeeRequest.getCustomerId());
//        Coffee coffee = em.find(Coffee.class, customerCoffeeRequest.getCode());
//
//
//        CustomerCoffee customerCoffee = new CustomerCoffee();
//        customerCoffee.setBuyDate(customerCoffeeRequest.getBuyDate());
//        customerCoffee.setPrice(customerCoffeeRequest.getPrice());
//        customerCoffee.setQuantity(customerCoffeeRequest.getQuantity());
//        customerCoffee.setCustomers(customer);
//        customerCoffee.setCoffee(coffee);
//
//        em.persist(customerCoffee);
//        return customerCoffee;
//    }
//
////    @Override
////    public CustomerCoffee addCustomerCoffeeByCustomerId(int customerId, CustomerCoffeeRequest customerCoffeeRequest) {
////        CustomerCoffee customerCoffee = new CustomerCoffee();
////        customerCoffee.setBuyDate(customerCoffee.getBuyDate());
////        customerCoffee.setPrice(customerCoffee.getPrice());
////        customerCoffee.setQuantity(customerCoffee.getQuantity());
////
////        Customer customer = customerService.getCustomerById(customerId);
////        customerCoffee.setCustomers(customer);
////        em.persist(customerCoffee);
////        return customerCoffee;
////    }
//
//    @Override
//    public CustomerCoffee uppdateCustomerCoffee(int id, CustomerCoffeeRequest customerCoffeeRequest) {
//        CustomerCoffee customerCoffee = getCustomerCoffeeById(id);
//        customerCoffee.setBuyDate(customerCoffeeRequest.getBuyDate());
//        customerCoffee.setPrice(customerCoffeeRequest.getPrice());
//        customerCoffee.setQuantity(customerCoffeeRequest.getQuantity());
//
//        em.merge(customerCoffee);
//        return customerCoffee;
//    }
//
//    @Override
//    public CustomerCoffee deleteCustomerCoffeeById(int customerCoffeeId) {
//        CustomerCoffee customerCoffee = em.find(CustomerCoffee.class,customerCoffeeId);
//        if (!Objects.isNull(customerCoffee)) {
//            em.remove(customerCoffee);
//        }
//       return customerCoffee;
//    }
//
//
//}
//

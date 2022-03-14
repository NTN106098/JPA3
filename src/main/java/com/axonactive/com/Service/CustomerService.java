package com.axonactive.com.Service;

import com.axonactive.com.Controller.Request.CustomerRequest;
import com.axonactive.com.Entity.Customer;

import java.util.List;

public interface CustomerService {
     Customer getCustomerById(int id);

     List<Customer>getAllCustomer();

     Customer addCustomer( CustomerRequest customerRequest);

     Customer updateCustomerById(int id, CustomerRequest customerRequest);

     void  deleteCustomerById(int id);
}

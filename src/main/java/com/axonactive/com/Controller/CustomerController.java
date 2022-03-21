package com.axonactive.com.Controller;


import com.axonactive.com.Controller.Request.CustomerRequest;
import com.axonactive.com.Entity.Customer;
import com.axonactive.com.Service.CustomerService;

import com.axonactive.com.Service.Impl.CustomerServiceImpl;


import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Transactional
public class CustomerController {

    @Inject
//    CustomerService customerService ;
    CustomerServiceImpl customerService;

    @GET
    @Path("/{id}")
    public Response getCustomerById(@PathParam("id") int id) {
        return Response.ok(customerService.findById(id)).build();
    }

    @POST
    public Response addCustomer(CustomerRequest customerRequest) {
        return  Response.ok(customerService.addCustomer(customerRequest)).build();
    }

    @PUT
    @Path("/{id}")
    public  Response updateCustomerById(@PathParam("id") int id, CustomerRequest customerRequest) {
        return  Response.ok(customerService.updateCustomerById(id, customerRequest)).build();
    }

    @DELETE
    @Path("/{id}")
    public  Response deleteCustomerById(@PathParam("id") int id) {
//        customerService.deleteCustomerById(id);
        customerService.remove(id);
        return  Response.ok().build();
    }

    @GET
    public  Response getAllCustomer() {
        return  Response.ok(customerService.getAllCustomer()).build();
    }
}

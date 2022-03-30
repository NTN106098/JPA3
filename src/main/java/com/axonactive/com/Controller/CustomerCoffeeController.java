package com.axonactive.com.Controller;

import com.axonactive.com.Controller.Request.CustomerCoffeeRequest;
import com.axonactive.com.Service.CustomerCoffeeService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customerCoffees")
//@Path("/customers/{id}/customerCoffees")
@Produces(MediaType.APPLICATION_JSON)
@Transactional
public class CustomerCoffeeController {
    @Inject
    CustomerCoffeeService customerCoffeeService;

    @GET
    public Response getAllCustomerCoffeeBy() {
        return Response.ok(customerCoffeeService.getAllCustomerCoffeeByCustomer()).build();
    }

    @GET
    @Path("/{id}")
    public  Response getCustomerCoffeeById(@PathParam("id") int id) {
        return  Response.ok(customerCoffeeService.getCustomerCoffeeById(id)).build();
    }

    @POST
    public  Response addCustomerCoffee(CustomerCoffeeRequest customerCoffeeRequest) {
        return  Response.ok(customerCoffeeService.addCustomerCoffee(customerCoffeeRequest)).build();
    }


    @PUT
    @Path("/{id}")
    public  Response updateCustomerCoffeeById(@PathParam("id") int id, CustomerCoffeeRequest customerCoffeeRequest) {
        return  Response.ok(customerCoffeeService.uppdateCustomerCoffee(id,customerCoffeeRequest)).build();
    }

    @DELETE
    @Path("/{id}")
    public  Response deleteCustomerCoffeeById(@PathParam("id") int id) {
        return  Response.ok(customerCoffeeService.deleteCustomerCoffeeById(id)).build();
    }

}

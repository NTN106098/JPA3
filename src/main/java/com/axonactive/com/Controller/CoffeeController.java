//package com.axonactive.com.Controller;
//
//import com.axonactive.com.Controller.Request.CoffeeRequest;
//import com.axonactive.com.Service.CoffeeService;
//import com.axonactive.com.Service.Impl.CoffeeServiceImpl;
//
//import javax.inject.Inject;
//import javax.transaction.Transactional;
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//@Path("/coffees")
//@Produces(MediaType.APPLICATION_JSON)
//@Transactional
//public class CoffeeController {
//   @Inject
////    CoffeeServiceImpl coffeeService;
//    CoffeeService coffeeService;
//
//    @GET
//    public Response getAllCoffee() {
//        return  Response.ok(coffeeService.getAllCoffee()).build();
//    }
//
//    @POST
//    public  Response addCoffee(CoffeeRequest coffeeRequest) {
//        return  Response.ok(coffeeService.addCoffee(coffeeRequest)).build();
//    }
//
//    @GET
//    @Path("/{id}")
//    public Response getCoffeById(@PathParam("id") int id) {
//        return  Response.ok(coffeeService.getCoffeeById(id)).build();
//
//    }
//
//    @PUT
//    @Path("/{code}")
//    public  Response updateCoffeById(@PathParam("code") int code, CoffeeRequest coffeeRequest) {
//        return  Response.ok(coffeeService.updateCoffeeById(code,coffeeRequest)).build();
//    }
//
//    @DELETE
//    @Path("/{code}")
//    public  Response deleteCoffee(@PathParam("code") int code) {
//        coffeeService.deleteCoffeById(code);
//        return Response.ok().build();
//    }
//}

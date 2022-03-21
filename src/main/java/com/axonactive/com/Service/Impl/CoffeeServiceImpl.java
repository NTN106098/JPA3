//package com.axonactive.com.Service.Impl;
//
//import com.axonactive.com.Controller.Request.CoffeeRequest;
//import com.axonactive.com.Entity.Coffee;
//import com.axonactive.com.Service.CoffeeService;
//import com.axonactive.com.persistence.AbstractCRUDBean;
//import com.axonactive.com.persistence.PersistenceService;
//
//import javax.enterprise.context.RequestScoped;
//import javax.inject.Inject;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//import java.util.List;
//import java.util.Objects;
//
//@RequestScoped
//@Transactional
//public class CoffeeServiceImpl extends AbstractCRUDBean<Coffee>  {
//    @PersistenceContext(unitName = "coffedb")
//    private EntityManager em;
//
//    @Inject
//    PersistenceService<Coffee> persistenceService;
////    @Inject
////    CoffeeService coffeeService;
////
//    @Override
//    protected PersistenceService<Coffee> getPersistenceService() {
//        return persistenceService;
//    }
////    @Override
////    public List<Coffee> getAllCoffee() {
////        return em.createQuery("SELECT c FROM Coffee c", Coffee.class).getResultList();
////    }
////
//      public  List<Coffee>getAllCoffee() {
//          return em.createQuery("SELECT c FROM Coffee c", Coffee.class).getResultList();
//      }
////
////    @Override
////    public Coffee addCoffee(CoffeeRequest coffeeRequest) {
////        Coffee coffee = new Coffee();
//////        coffee.setCode(coffeeRequest.getCode());
////        coffee.setName(coffeeRequest.getName());
////        coffee.setType(coffeeRequest.getType());
////
////        em.persist(coffee);
////        return coffee;
////    }
//////        public Coffee addCoffee(CoffeeRequest  coffeeRequest){
//////          Coffee coffee = new Coffee();
//////            coffee.setCode(coffeeRequest.getCode());
//////            coffee.setName(coffeeRequest.getName());
//////            coffee.setType(coffeeRequest.getType());
//////
//////            save(coffee);
//////            return coffee;
//////        }
////
////    @Override
////    public Coffee getCoffeeById(int code) {
////        return em.find(Coffee.class,code);
////    }
////
////    @Override
////    public Coffee updateCoffeeById(int code, CoffeeRequest coffeeRequest) {
////        Coffee coffee = getCoffeeById(code);
////        coffee.setName(coffeeRequest.getName());
////        coffee.setType(coffeeRequest.getType());
////
////        em.remove(coffee);
////        return coffee;
////    }
////
////    @Override
////    public void deleteCoffeById(int code) {
////        Coffee coffee = em.find(Coffee.class,code);
////        if(!Objects.isNull(coffee)) {
////            em.remove(coffee);
////        }
////    }
//
//
//}

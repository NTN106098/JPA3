package com.axonactive.com.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_coffee")
@NamedQueries({
        @NamedQuery(name =CustomerCoffee.GET_ALL,query = "FROM CustomerCoffee" ),
        @NamedQuery(name =CustomerCoffee.GET_BY_ID, query = "SELECT c FROM CustomerCoffee c WHERE c.id = :id")
})
public class CustomerCoffee  {
    private final static String QUALIFIED = "com.axonactive.com.Entity";
    public final static String GET_ALL = QUALIFIED + "getCustomerCoffee";
    public final static String GET_BY_ID = QUALIFIED + "getCustomerCoffeeById";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private  Integer id;

    @Column(name = "buy_date")
    private LocalDate buyDate;

    @Column()
    private Integer quantity;

    @Column()
    private Integer price;

    @Column()
    private  String code;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customers;

    @ManyToOne
    @JoinColumn(name = "coffee_id",nullable = false)
    private Coffee coffee;

}

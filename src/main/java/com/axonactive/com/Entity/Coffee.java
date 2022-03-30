package com.axonactive.com.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "coffee")
@NamedQueries({
        @NamedQuery(name = Coffee.GET_ALL,query = "FROM Coffee"),
        @NamedQuery(name = Coffee.GET_COFFEE_BY_ID, query = "SELECT c FROM Coffee c WHERE c.id=:id")
})
public class Coffee  {

    private final static  String QUALIED = "com.axonactive.com.Entity";
    public final static  String GET_ALL = QUALIED + "getCoffee";
    public final static  String GET_COFFEE_BY_ID = QUALIED + "getCoffeeById";
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column()
    private  String type;

    @Column
    private  String code;
}

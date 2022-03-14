package com.axonactive.com.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "coffee")
public class Coffee {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private String code;

    @Column(nullable = false)
    private String name;

    @Column(name = "type")
    private  String type;



}

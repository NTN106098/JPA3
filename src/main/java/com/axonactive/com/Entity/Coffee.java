package com.axonactive.com.Entity;

import com.axonactive.com.persistence.IEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "coffee")
public class Coffee implements IEntity {
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

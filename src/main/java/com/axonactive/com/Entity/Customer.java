package com.axonactive.com.Entity;


import com.axonactive.com.Entity.enumerate.Gender;
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
@Table(name = "customer")
@NamedQueries({
        @NamedQuery(name = Customer.GET_ALL_CUSTOMER, query = "FROM Customer"),
        @NamedQuery(name = Customer.GET_BY_ID, query = "SELECT c FROM Customer c WHERE c.id= :id")
})

public class Customer  {
        private static final String QUALIFIED = "com.axonactive.com.Entity;";
        public static final String GET_BY_ID = QUALIFIED + "getCustomerById" ;
        public static final String GET_ALL_CUSTOMER = QUALIFIED + "getCustomer";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "city")
    private String city;

}

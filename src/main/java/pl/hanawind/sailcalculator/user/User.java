package pl.hanawind.sailcalculator.user;


import lombok.Data;
import lombok.Generated;
import pl.hanawind.sailcalculator.order.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;


    @OneToMany
    List<Order> orderList;

}

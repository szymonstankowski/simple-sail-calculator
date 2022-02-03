package pl.hanawind.sailcalculator.user;


import lombok.Data;

import pl.hanawind.sailcalculator.order.Order;
import pl.hanawind.sailcalculator.sail.Sail;

import javax.persistence.*;

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




}

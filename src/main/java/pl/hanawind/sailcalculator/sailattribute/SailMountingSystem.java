package pl.hanawind.sailcalculator.sailattribute;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="mountingSystem")
public class SailMountingSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}

package pl.hanawind.sailcalculator.sailattribute;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@Table(name="mountingSystem")
public class SailMountingSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Wybierz system")
    private String name;

}

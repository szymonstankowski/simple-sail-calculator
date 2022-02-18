package pl.hanawind.sailcalculator.sailattribute;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class SailType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TYP_ŻAGLA")
    @NotBlank(message = "Wybierz typ żagla.")
    private String name;



}

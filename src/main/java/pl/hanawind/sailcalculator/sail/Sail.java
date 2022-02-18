package pl.hanawind.sailcalculator.sail;

import lombok.Data;
import pl.hanawind.sailcalculator.sailattribute.SailMountingSystem;
import pl.hanawind.sailcalculator.sailattribute.SailType;
import pl.hanawind.sailcalculator.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Data
public class Sail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ILOŚĆ_PEŁZACZY")
    private int slidersNumber;

    @Column(name = "DŁUGOŚĆ_LIKU_PRZEDNIEGO")
    @NotBlank(message = "To pole nie może być puste")
    private int luffLength;

    @Column(name = "DŁUGOŚĆ_LIKU_DOLNEGO")
    @NotBlank(message = "To pole nie może być puste")
    private int boomLength;

    @Column(name = "CENA_ŻAGLA")
    private  double sailPrice;

    @Column(name = "POWIERZCHNIA_ŻAGLA")
    private double sailArea;

    @ManyToOne
    SailType sailType;

    @ManyToOne
    SailMountingSystem sailMountingSystem;

    @ManyToOne
    User user;








}

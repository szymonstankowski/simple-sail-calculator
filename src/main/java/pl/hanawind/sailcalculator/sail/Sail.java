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


    @NotBlank(message = "To pole nie może być puste")
    private int luffLength;


    @NotBlank(message = "To pole nie może być puste")
    private int boomLength;


    @NotBlank(message = "To pole nie może być puste")
    private int leechLength;


    @NotBlank
    private boolean battens;


    private double sailPrice;


    private double sailArea;

    @ManyToOne
    private SailType sailType;

    @ManyToOne
    private SailMountingSystem sailMountingSystem;

    @ManyToOne
    private User user;

    private boolean isRacing;

    private boolean sliders;


    public void setSlidersNumber(int slidersNumber) {
    }
}

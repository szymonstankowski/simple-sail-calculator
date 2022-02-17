package pl.hanawind.sailcalculator.sail;

import lombok.Data;
import pl.hanawind.sailcalculator.sailattribute.SailMountingSystem;
import pl.hanawind.sailcalculator.sailattribute.SailType;
import pl.hanawind.sailcalculator.user.User;

import javax.persistence.*;

@Entity
@Data
public class Sail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int slidesNumber;
    private int luffLength;
    private int boomLength;
    private double sailPrice;
    private double sailArea;

    @ManyToOne
    SailType sailType;
    @ManyToOne
    SailMountingSystem sailMountingSystem;






}

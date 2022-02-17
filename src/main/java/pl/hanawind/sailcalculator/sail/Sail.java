package pl.hanawind.sailcalculator.sail;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.hanawind.sailcalculator.sailattribute.SailMountingSystem;
import pl.hanawind.sailcalculator.sailattribute.SailType;
import pl.hanawind.sailcalculator.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Sail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private SailType sailType;
    @OneToOne
    private SailMountingSystem sailMountingSystem;
    private int slidesNumber;
    private int luffLength;
    private int boomLength;


    public Sail() {
    }
}

package pl.hanawind.sailcalculator.sail;

import lombok.Data;
import pl.hanawind.sailcalculator.user.User;

import javax.persistence.*;

@Entity
@Data
public class Sail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean regularSail;
    private boolean racingSail;
    private boolean luffLine;
    private boolean slides;
    private int slidesNumber;
    private int luffLength;
    private int boomLength;




}

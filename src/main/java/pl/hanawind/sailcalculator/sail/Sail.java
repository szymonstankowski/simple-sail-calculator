package pl.hanawind.sailcalculator.sail;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

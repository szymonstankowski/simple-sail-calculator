package pl.hanawind.sailcalculator.order;

import lombok.Data;
import pl.hanawind.sailcalculator.sail.Sail;
import pl.hanawind.sailcalculator.user.User;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateTime;




}

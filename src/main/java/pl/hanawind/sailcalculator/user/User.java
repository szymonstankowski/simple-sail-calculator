package pl.hanawind.sailcalculator.user;


import lombok.Data;
import pl.hanawind.sailcalculator.sail.Sail;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "IMIĘ")
    @NotBlank(message = "To pole nie może być puste")
    private String name;

    @Column(name = "NAZWISKO")
    @NotBlank(message ="To pole nie może być puste" )
    private String lastName;

    @Column(name = "NUMER_TELEFONU")
    @NotBlank(message ="To pole nie może być puste" )
    private String phoneNumber;

    @Column(name = "E-MAIL")
    @NotBlank(message ="To pole nie może być puste" )
    private String email;


    @OneToMany
    @JoinColumn(name = "USER_SAIL")
    List<Sail> sail = new ArrayList<>();



}

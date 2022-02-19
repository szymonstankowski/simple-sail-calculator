package pl.hanawind.sailcalculator.user;


import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "To pole nie może być puste")
    private String name;


    @NotBlank(message ="To pole nie może być puste" )
    private String lastName;


    @NotBlank(message ="To pole nie może być puste" )
    private String phoneNumber;

    @NotBlank(message ="To pole nie może być puste" )
    @Email
    private String email;


    @Override
    public String toString() {
        return  name;
    }
}

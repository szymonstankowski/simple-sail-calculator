package pl.hanawind.sailcalculator.user;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.hanawind.sailcalculator.sail.SailService;
import pl.hanawind.sailcalculator.sailattribute.SailType;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;
    private final SailService sailService;

    public UserController(UserService userService, SailService sailService) {
        this.userService = userService;
        this.sailService = sailService;
    }


    @GetMapping("/newuser")
    public String createUser(Model model){
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/newuser")
    public String addUser(User user){

        userService.addUser(user);
        //todo napisac jsp z info o przeslaniu na adres mailowy tokena do weryfikacji konta ktory
        // bedzie aktywowal konto i kierowan na strone logowania
        // zaimplementowac spring security
        return "confirm-account";
    }



}

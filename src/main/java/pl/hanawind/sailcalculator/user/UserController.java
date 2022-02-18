package pl.hanawind.sailcalculator.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pl.hanawind.sailcalculator.sail.SailService;

import javax.validation.Valid;


@Controller
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
    public String addUser(@RequestBody @Valid User user, BindingResult result){
        if (result.hasErrors()){
            return "redirect:/newuser";
        }
        userService.addUser(user);
        //todo zamienic na przejscie do widoku info o sprawdzeniu emaila w celu weryfikacji
        // po kliknieciu w link w mailu przejscie do strony logowania i dalej do panelu usera
        return "user-form";
    }



}

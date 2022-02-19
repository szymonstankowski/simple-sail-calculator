package pl.hanawind.sailcalculator.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.hanawind.sailcalculator.sail.SailService;

import javax.validation.Valid;
import java.security.Principal;


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
    public String addUser(@Valid User user, BindingResult result){
        if (result.hasErrors()){
            return "redirect:/newuser";
        }
        userService.addUser(user);
        return "redirect:/user";
    }

    @GetMapping("/user")
    public String userSails(Model model){

        model.addAttribute("sails", userService.userSails(userService.getById(1L)));
        return "user-dashboard";

    }

}

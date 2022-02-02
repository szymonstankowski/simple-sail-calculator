package pl.hanawind.sailcalculator.user;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/newuser")
    public String createUser(Model model){
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/adduser")
    public String addUser(User user, BindingResult result){
        if (result.hasErrors()){
            return "redirect:/newuser";
        }
        userService.addUser(user);
        //todo napisac jsp z info o przeslaniu na adres mailowy tokena do weryfikacji konta ktory
        // bedzie aktywowal konto i kierowan na strone logowania
        // zaimplementowac spring security
        return "confirm-account";
    }
}

package pl.hanawind.sailcalculator.disposition;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DispositionController {

    private final DispositionService dispositionService;

    public DispositionController(DispositionService dispositionService) {
        this.dispositionService = dispositionService;
    }

    @GetMapping("/neworder")
    public String newOrder(Model model){
        model.addAttribute("order", new Disposition());
        return "order-send";
    }

    @PostMapping("/addorder")
    public String addOrder(BindingResult result, @Valid Disposition disposition){
        if (result.hasErrors()){
            return "redirect:/neworder";
        }

        dispositionService.addOrder(disposition);
        return "redirect:/user-dashboard";
    }
}

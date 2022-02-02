package pl.hanawind.sailcalculator.sail;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
public class SailController {

    private final SailService sailService;

    public SailController(SailService sailService) {
        this.sailService = sailService;
    }

    @GetMapping("/newSail")
    public String newSailForm(Model model){
        model.addAttribute("sail", new Sail());
        return "sail-form";
    }
    @PostMapping("/calculateNewSail")
    public String newSail(Sail sail, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "redirect:/newSail";
        }
        sailService.calculateSailPrice(sail.getBoomLength(), sail.getLuffLength());

        //todo napisac jsp USER-DASHBOARD w ktorym beda sie wyswietlac wszystkie wprowadzone
        // zagle usera, ma tam byc tabela z wyswietlaniem parametrow zagla oraz cena
        // i button do potwierdzania zamowienia wysylajacy potwierdzenie mailowe

        return "user-dashboard";

    }




}

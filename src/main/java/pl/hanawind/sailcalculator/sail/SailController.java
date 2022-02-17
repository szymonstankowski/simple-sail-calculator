package pl.hanawind.sailcalculator.sail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.hanawind.sailcalculator.sailattribute.SailMountingSystem;
import pl.hanawind.sailcalculator.sailattribute.SailType;

import java.util.List;

@Controller
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

    @PostMapping("/newSail")
    public String newSail(Sail sail) {
        sailService.saveSail(sail);
        return "redirect:/newSail";
    }


    @ModelAttribute("sailTypes")
    public List<SailType> sailTypes(){
        return sailService.getAllSailTypes();
    }
    @ModelAttribute("mountingTypes")
    public List<SailMountingSystem> sailMountingTypes(){
        return sailService.getAllSailMountingSystems();
    }
}

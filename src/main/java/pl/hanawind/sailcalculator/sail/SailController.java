package pl.hanawind.sailcalculator.sail;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SailController {

    private final SailService sailService;

    public SailController(SailService sailService) {
        this.sailService = sailService;
    }
}

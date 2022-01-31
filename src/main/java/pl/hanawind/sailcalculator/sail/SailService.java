package pl.hanawind.sailcalculator.sail;

import org.springframework.stereotype.Service;

@Service
public class SailService {

    private final SailRepository sailRepository;

    public SailService(SailRepository sailRepository) {
        this.sailRepository = sailRepository;
    }



}

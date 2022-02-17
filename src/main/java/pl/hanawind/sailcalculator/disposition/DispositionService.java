package pl.hanawind.sailcalculator.disposition;

import org.springframework.stereotype.Service;

@Service
public class DispositionService {

    private final DispositionRepository dispositionRepository;

    public DispositionService(DispositionRepository dispositionRepository) {
        this.dispositionRepository = dispositionRepository;
    }

    public void addOrder(Disposition disposition){
        dispositionRepository.save(disposition);
    }
}

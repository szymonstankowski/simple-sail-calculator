package pl.hanawind.sailcalculator.sail;

import org.springframework.stereotype.Service;
import pl.hanawind.sailcalculator.repository.SailMountingSystemRepository;
import pl.hanawind.sailcalculator.repository.SailTypeRepository;
import pl.hanawind.sailcalculator.sailattribute.SailMountingSystem;
import pl.hanawind.sailcalculator.sailattribute.SailType;

import java.util.List;

@Service
public class SailService {

    private final SailRepository sailRepository;
    private final SailTypeRepository sailTypeRepository;
    private final SailMountingSystemRepository sailMountingSystemRepository;



    private final double COST = 127.0;

    public SailService(SailRepository sailRepository, SailTypeRepository sailTypeRepository, SailMountingSystemRepository sailMountingSystemRepository) {
        this.sailRepository = sailRepository;
        this.sailTypeRepository = sailTypeRepository;
        this.sailMountingSystemRepository = sailMountingSystemRepository;
    }

    public double calculateSailArea(int a, int h){
        return (a*h)/2;
    }

    public double calculateSailPrice(int a, int h){

        double sailArea = calculateSailArea(a, h);

        return sailArea*COST;

    }

    public void saveSail(Sail sail){
        sailRepository.save(sail);
    }


    public List<SailType> sailTypeList(){
        return sailTypeRepository.findAll();
    }

    public List<SailMountingSystem> sailMountingSystemList() {
        return sailMountingSystemRepository.findAll();

    }
}

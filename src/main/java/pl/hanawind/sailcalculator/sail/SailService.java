package pl.hanawind.sailcalculator.sail;

import org.springframework.stereotype.Service;

@Service
public class SailService {

    private final SailRepository sailRepository;
    private final double COST = 127.0;

    public SailService(SailRepository sailRepository) {
        this.sailRepository = sailRepository;
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



}

package pl.hanawind.sailcalculator.sail;

import org.springframework.stereotype.Service;
import pl.hanawind.sailcalculator.sailattribute.SailMountingSystem;
import pl.hanawind.sailcalculator.sailattribute.SailMountingSystemRepository;
import pl.hanawind.sailcalculator.sailattribute.SailType;
import pl.hanawind.sailcalculator.sailattribute.SailTypeRepository;

import java.util.List;

@Service
public class SailService {

    private final SailRepository sailRepository;
    private final SailMountingSystemRepository sailMountingSystemRepository;
    private final SailTypeRepository sailTypeRepository;

    private final double CLOTH_PRICE = 127.0;
    private final double SINGLE_SLIDER_COST = 4.0;
    private final double SLIDERS_DENSITY= 15.0;
    private final double LUFF_LINE_COST_PER_METER = 10.0;

    public SailService(SailRepository sailRepository,
                       SailMountingSystemRepository sailMountingSystemRepository,
                       SailTypeRepository sailTypeRepository) {
        this.sailRepository = sailRepository;
        this.sailMountingSystemRepository = sailMountingSystemRepository;
        this.sailTypeRepository = sailTypeRepository;
    }

    public double calucalteSailArea(int boomLength,int luffLength){
        return (boomLength*luffLength)/2;
    }

    public double calculateSailClothPrice(int boomLength, int luffLength){
        return calucalteSailArea(boomLength, luffLength)* CLOTH_PRICE;
    }

    public double slidersCost(Sail sail,double SINGLE_SLIDER_COST, double SLIDERS_DENSITY){
        return  ((sail.getLuffLength() / SLIDERS_DENSITY) * SINGLE_SLIDER_COST);
    }

    public double luffLineCost(Sail sail, double LUFF_LINE_COST_PER_METER){
        return sail.getLuffLength() * LUFF_LINE_COST_PER_METER;
    }

    public void saveSail(Sail sail){
        double clothPrice;
        if (sail.sailMountingSystem.equals(1)){
            clothPrice = calculateSailClothPrice(sail.getBoomLength(), sail.getLuffLength());
            sail.setSailPrice(clothPrice + slidersCost(sail,SINGLE_SLIDER_COST, SLIDERS_DENSITY));
        }else {
            clothPrice = calculateSailClothPrice(sail.getBoomLength(), sail.getBoomLength());
            sail.setSailPrice(clothPrice + luffLineCost(sail,LUFF_LINE_COST_PER_METER));
        }
        sail.setSailArea(calucalteSailArea(sail.getBoomLength(), sail.getLuffLength()));
        sailRepository.save(sail);
    }

    public List<SailMountingSystem> getAllSailMountingSystems(){
        return sailMountingSystemRepository.findAll();
    }

    public List<SailType> getAllSailTypes(){
        return sailTypeRepository.findAll();
    }





}

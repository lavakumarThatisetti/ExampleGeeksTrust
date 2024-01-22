package strategy;

public class CorporateWaterStrategy implements WaterSelectionStrategy{
    @Override
    public double getCostPerLiter() {
        return 1;
    }
}

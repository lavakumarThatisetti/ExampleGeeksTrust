package strategy;

public class BoreWellWaterStrategy implements WaterSelectionStrategy {
    @Override
    public double getCostPerLiter() {
        return 1.5;
    }
}


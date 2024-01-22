package strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWaterSelectionStrategy {
    public WaterSelectionStrategy waterSelectionStrategy;

    @Test
    public void TestWaterSelectionStrategy_CorporateWater() {
        this.waterSelectionStrategy = new CorporateWaterStrategy();
        Assertions.assertEquals(1,waterSelectionStrategy.getCostPerLiter());
    }
    @Test
    public void TestWaterSelectionStrategy_BoreWellWater() {
        this.waterSelectionStrategy = new BoreWellWaterStrategy();
        Assertions.assertEquals(1.5,waterSelectionStrategy.getCostPerLiter());
    }
    @Test
    public void TestWaterSelectionStrategy_TankWater() {
        this.waterSelectionStrategy = new TankWaterStrategy();
        Assertions.assertEquals(0,waterSelectionStrategy.getCostPerLiter());
    }
}

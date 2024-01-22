package factory;


import entity.WaterType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import strategy.*;

public class TestWaterTypeSelectionFactory {

    WaterTypeSelectionFactory waterTypeSelectionFactory = new WaterTypeSelectionFactory();

    @Test
    public void verifyValidStrategies(){
        Assertions.assertTrue(
                waterTypeSelectionFactory.getWaterTypeStrategy(WaterType.CORPORATION_WATER) instanceof CorporateWaterStrategy
        );
        Assertions.assertTrue(
                waterTypeSelectionFactory.getWaterTypeStrategy(WaterType.BOREWELL_WATER) instanceof BoreWellWaterStrategy
        );
        Assertions.assertTrue(
                waterTypeSelectionFactory.getWaterTypeStrategy(WaterType.TANK_WATER) instanceof TankWaterStrategy
        );
    }
}
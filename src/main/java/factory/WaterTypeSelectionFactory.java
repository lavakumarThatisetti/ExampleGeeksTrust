package factory;

import entity.WaterType;
import strategy.*;

import java.util.HashMap;
import java.util.Map;

public class WaterTypeSelectionFactory {
    private final Map<WaterType, WaterSelectionStrategy> waterSelectionStrategyMap;

    public WaterTypeSelectionFactory() {
        waterSelectionStrategyMap = new HashMap<>();
        waterSelectionStrategyMap.put(WaterType.CORPORATION_WATER, new CorporateWaterStrategy());
        waterSelectionStrategyMap.put(WaterType.BOREWELL_WATER, new BoreWellWaterStrategy());
        waterSelectionStrategyMap.put(WaterType.TANK_WATER, new TankWaterStrategy());
    }
    public WaterSelectionStrategy getWaterTypeStrategy(WaterType type) {
        return waterSelectionStrategyMap.get(type);
    }
}
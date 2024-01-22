package factory;

import entity.ApartmentType;
import strategy.ApartmentSelectionStrategy;
import strategy.ThreeBhkSelectionStrategy;
import strategy.TwoBhkSelectionStrategy;

import java.util.HashMap;
import java.util.Map;

public class ApartmentSelectionFactory {
    private final Map<ApartmentType, ApartmentSelectionStrategy> apartmentSelectionStrategyMap;

    public ApartmentSelectionFactory() {
        apartmentSelectionStrategyMap = new HashMap<>();
        apartmentSelectionStrategyMap.put(ApartmentType.TWO_BHK, new TwoBhkSelectionStrategy());
        apartmentSelectionStrategyMap.put(ApartmentType.THREE_BHK, new ThreeBhkSelectionStrategy());
    }
    public ApartmentSelectionStrategy getApartmentStrategy(ApartmentType type) {
        return apartmentSelectionStrategyMap.get(type);
    }
}
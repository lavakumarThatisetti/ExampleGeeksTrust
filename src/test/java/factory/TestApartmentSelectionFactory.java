package factory;

import entity.ApartmentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import strategy.ThreeBhkSelectionStrategy;
import strategy.TwoBhkSelectionStrategy;

public class TestApartmentSelectionFactory {

    ApartmentSelectionFactory apartmentSelectionFactory = new ApartmentSelectionFactory();

    @Test
    public void verifyValidStrategies(){
        Assertions.assertTrue(apartmentSelectionFactory.getApartmentStrategy(ApartmentType.TWO_BHK) instanceof TwoBhkSelectionStrategy);
        Assertions.assertTrue(apartmentSelectionFactory.getApartmentStrategy(ApartmentType.THREE_BHK) instanceof ThreeBhkSelectionStrategy);
    }
}
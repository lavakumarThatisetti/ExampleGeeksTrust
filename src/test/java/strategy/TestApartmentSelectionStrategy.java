package strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApartmentSelectionStrategy {
    public ApartmentSelectionStrategy apartmentSelectionStrategy;

    @Test
    public void TestApartmentSelectionStrategy_TwoBHK(){
        this.apartmentSelectionStrategy = new TwoBhkSelectionStrategy();
        Assertions.assertEquals(900,apartmentSelectionStrategy.getApartmentTotalLitersOfWater());
        Assertions.assertEquals(1215,
                apartmentSelectionStrategy.getTotalCostOfTheWaterForApartment(3,7)
        );
        Assertions.assertEquals(3100,
                apartmentSelectionStrategy.getAdditionalMemberCost(0, 1200)
        );
        Assertions.assertEquals(900,
                apartmentSelectionStrategy.getAdditionalMemberLiter(3)
        );

    }

    @Test
    public void TestApartmentSelectionStrategy_ThreeBHK(){
        this.apartmentSelectionStrategy = new ThreeBhkSelectionStrategy();
        Assertions.assertEquals(1500,apartmentSelectionStrategy.getApartmentTotalLitersOfWater());
        Assertions.assertEquals(2025,
                apartmentSelectionStrategy.getTotalCostOfTheWaterForApartment(3,7)
        );
        Assertions.assertEquals(3100,
                apartmentSelectionStrategy.getAdditionalMemberCost(0,1200)
        );
        Assertions.assertEquals(1500,
                apartmentSelectionStrategy.getAdditionalMemberLiter(5)
        );
    }
}

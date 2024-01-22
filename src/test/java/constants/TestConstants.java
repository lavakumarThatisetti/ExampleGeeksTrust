package constants;

import entity.ApartmentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestConstants {
    @Test
    public void checkApartmentTypeHashMap(){
        Assertions.assertEquals(2, Constants.apartmentTypeHashMap.size());
        Assertions.assertEquals(ApartmentType.TWO_BHK,Constants.apartmentTypeHashMap.get(2));
        Assertions.assertEquals(ApartmentType.THREE_BHK,Constants.apartmentTypeHashMap.get(3));
    }
}

package service;


import factory.ApartmentSelectionFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.lang.reflect.Field;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestWaterManagementService {

    WaterManagementService waterManagementService = new WaterManagementService(new ApartmentSelectionFactory());
    int apartmentSize = 2;
    int corporationWaterRatio =3;
    int borewellWaterRatio= 7;

    @BeforeAll
    public void setup(){
        waterManagementService.allocateWater(apartmentSize,corporationWaterRatio, borewellWaterRatio);
        waterManagementService.addGuests(2);
        waterManagementService.addGuests(3);
    }

    @Test
    public void allocateWater() throws NoSuchFieldException {
        Field privateFactoryField = WaterManagementService.class.getDeclaredField("factory");
        privateFactoryField.setAccessible(true);
        Assertions.assertNotNull(privateFactoryField);
    }

    @Test
    public void addGuests() throws NoSuchFieldException {
        Field privateGuestsField = WaterManagementService.class.getDeclaredField("additional_guests");
        privateGuestsField.setAccessible(true);
        Assertions.assertNotNull(privateGuestsField);
    }

    @Test
    public void bill() {
        String bill = waterManagementService.bill();
        Assertions.assertEquals("2400 5215",bill);
    }


}

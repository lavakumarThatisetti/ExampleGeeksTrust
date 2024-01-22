package service;

import constants.Constants;
import entity.Apartment;
import entity.ApartmentType;
import entity.Person;
import factory.ApartmentSelectionFactory;
import strategy.ApartmentSelectionStrategy;

import java.util.HashMap;

public class WaterManagementService {
    ApartmentSelectionFactory factory;
    ApartmentSelectionStrategy apartmentStrategy;
    private int TOTAL_WATER_CONSUMED_IN_LITERS = 0;
    private int TOTAL_COST = 0;
    private int additional_guests = 0;
    private int additional_water_consumed_by_guests = 0;
    HashMap<ApartmentType, Apartment> apartmentHashMap;


    public WaterManagementService(ApartmentSelectionFactory factory) {
        this.factory = factory;
    }
    public void allocateWater(int apartmentSize, int corporationWaterRatio, int borewellWaterRatio) {
        ApartmentType apartmentType = Constants.apartmentTypeHashMap.get(apartmentSize);
        apartmentStrategy = factory.getApartmentStrategy(apartmentType);
        TOTAL_WATER_CONSUMED_IN_LITERS = apartmentStrategy.getApartmentTotalLitersOfWater();
        TOTAL_COST = apartmentStrategy.getTotalCostOfTheWaterForApartment(corporationWaterRatio,borewellWaterRatio);
    }

    public void addGuests(int numberOfGuests) {
        int additional_water_consumed = apartmentStrategy.getAdditionalMemberLiter(numberOfGuests);
        TOTAL_COST+=apartmentStrategy.getAdditionalMemberCost(
                additional_water_consumed_by_guests, additional_water_consumed
        );
        TOTAL_WATER_CONSUMED_IN_LITERS+=additional_water_consumed;
        additional_guests +=numberOfGuests;
        additional_water_consumed_by_guests+=additional_water_consumed;
    }

    public String bill() {
        return TOTAL_WATER_CONSUMED_IN_LITERS+" "+TOTAL_COST;
    }

    public void addPerson(ApartmentType apartmentType, Person person){
        if(apartmentHashMap.get(apartmentType)!=null){
            Apartment apartment = apartmentHashMap.get(apartmentType);
            apartment.addPersonToApartment(person);
            apartmentHashMap.put(apartmentType,apartment);
        }else{
            Apartment apartment = new Apartment();
            apartment.addPersonToApartment(person);
            apartmentHashMap.put(apartmentType,apartment);
        }
    }
}

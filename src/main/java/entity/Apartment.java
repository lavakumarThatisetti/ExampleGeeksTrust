package entity;

import java.util.HashMap;

public class Apartment {
    ApartmentType apartmentType;
    int totalNoOfGuests;
    int totalCost;
    int totalLitersOfWater;
    HashMap<Integer, Person> hashMap;

    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
    }

    public int getTotalNoOfGuests() {
        return totalNoOfGuests;
    }

    public void setTotalNoOfGuests(int totalNoOfGuests) {
        this.totalNoOfGuests = totalNoOfGuests;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTotalLitersOfWater() {
        return totalLitersOfWater;
    }

    public void setTotalLitersOfWater(int totalLitersOfWater) {
        this.totalLitersOfWater = totalLitersOfWater;
    }

    public void addPersonToApartment(Person person){
        hashMap.put(person.getId(),person);
    }

    public HashMap<Integer,Person> getPersonsInApartment(){
        return hashMap;
    }
}

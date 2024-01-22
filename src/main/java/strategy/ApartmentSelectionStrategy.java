package strategy;

public interface ApartmentSelectionStrategy {

    int getApartmentTotalLitersOfWater();

    int getTotalCostOfTheWaterForApartment(int corporateWater, int boreWater);

    int getAdditionalMemberCost(int initialWater, int waterConsumedByGuests);

    int getAdditionalMemberLiter(int members);
}

package strategy;

import entity.WaterType;
import factory.WaterTypeSelectionFactory;

public class TwoBhkSelectionStrategy implements ApartmentSelectionStrategy {

    final int initialCost = 900;
    final int totalNumberOfPersons = 3;
    WaterTypeSelectionFactory waterTypeSelectionFactory;
    CorporateWaterStrategy corporateWaterStrategy;
    BoreWellWaterStrategy boreWellWaterStrategy;
    TankWaterStrategy tankWaterStrategy;


    public TwoBhkSelectionStrategy() {
        waterTypeSelectionFactory = new WaterTypeSelectionFactory();
        corporateWaterStrategy  = (CorporateWaterStrategy) waterTypeSelectionFactory.getWaterTypeStrategy(WaterType.CORPORATION_WATER);
        boreWellWaterStrategy  = (BoreWellWaterStrategy) waterTypeSelectionFactory.getWaterTypeStrategy(WaterType.BOREWELL_WATER);
        tankWaterStrategy  = (TankWaterStrategy) waterTypeSelectionFactory.getWaterTypeStrategy(WaterType.TANK_WATER);
    }

    @Override
    public int getApartmentTotalLitersOfWater() {
        return initialCost;
    }

    @Override
    public int getTotalCostOfTheWaterForApartment(int corporateWater, int boreWater) {
        int ratioSum = corporateWater + boreWater;
        double ratioCost = (double) this.initialCost/ratioSum;
        double corporateSum = Math.ceil(ratioCost * corporateWater * corporateWaterStrategy.getCostPerLiter());
        double boreSum = Math.ceil(ratioCost * boreWater * boreWellWaterStrategy.getCostPerLiter());
        return (int) Math.round(corporateSum + boreSum);
    }

    @Override
    public int getAdditionalMemberCost(int initialWater, int waterConsumedByGuests) {
        return (int) Math.round(tankWaterStrategy.getTotalCost(initialWater, waterConsumedByGuests));
    }

    @Override
    public int getAdditionalMemberLiter(int members) {
        return getPerPersonCost()*members;
    }

    private int getPerPersonCost() {
        return initialCost/totalNumberOfPersons;
    }

}

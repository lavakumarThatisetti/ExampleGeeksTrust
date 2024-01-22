package strategy;

public class TankWaterStrategy implements WaterSelectionStrategy {
    final int costForFiveHundred = 2;
    final int costForLessThanFifteenHundred = 3;
    final int costForLessThanThreeThousand = 5;
    final int costForGreaterThanThreeThousand = 8;

    @Override
    public double getCostPerLiter() {
        return 0;
    }

    public double getTotalCost(int initialLiters, int addedLiters) {
        double cost=0;
        int low = initialLiters, high = initialLiters+addedLiters;

        // For Checking up to 500
        if(low+500 <=500 && low+500 <=high){
            cost+=500*getCostForFiveHundred();
            low+=500;
        }else if(high <= 500){
            cost +=  (high-low)* getCostForFiveHundred();
            return cost;
        }

        // For checking up to 1500
        if(low+1000 <=1500 && low+1500<=high) {
            cost+=1000*getCostForLessThanFifteenHundred();
            low+=1000;
        }else if(high <= 1500){
            cost +=  (high-low)* getCostForLessThanFifteenHundred();
            return cost;
        }

        // For checking up to 3000
        if(low+1500 <=3000 && low+1500<=high){
            cost+=1500*getCostForLessThanThreeThousand();
            low+=1500;
        }else if(high < 3000){
            cost +=  (high-low)* getCostForLessThanThreeThousand();
            return cost;
        }

        // For checking greater than 3000;
        if(low < high){
            cost +=  (high-low)* getCostForGreaterThanThreeThousand();
            return cost;
        }

        return cost;
    }

    public int getCostForFiveHundred() {
        return costForFiveHundred;
    }

    public int getCostForLessThanFifteenHundred() {
        return costForLessThanFifteenHundred;
    }

    public int getCostForLessThanThreeThousand() {
        return costForLessThanThreeThousand;
    }

    public int getCostForGreaterThanThreeThousand() {
        return costForGreaterThanThreeThousand;
    }
}

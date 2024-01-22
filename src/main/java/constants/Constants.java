package constants;

import entity.ApartmentType;

import java.util.HashMap;

public class Constants {
    public static HashMap<Integer, ApartmentType> apartmentTypeHashMap = new HashMap<>();


    static {
        apartmentTypeHashMap.put(2, ApartmentType.TWO_BHK);
        apartmentTypeHashMap.put(3,ApartmentType.THREE_BHK);
    }
}

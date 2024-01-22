package utils;

public class ProjectUtilities {

    public static int[] getNumbersFromRatio(String ratio){
        String[] ratios = ratio.split(":");
        return new int[]{Integer.parseInt(ratios[0]),Integer.parseInt(ratios[1])};
    }
}

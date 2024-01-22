import entity.Command;
import factory.ApartmentSelectionFactory;
import service.WaterManagementService;
import utils.ProjectUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Geektrust {
    public static void main(String[] args) {
        WaterManagementService waterManagementService = new WaterManagementService(
                new ApartmentSelectionFactory()
        );
        try {
            // Load the File from command Line argument
            FileInputStream fis=new FileInputStream(args[0]);
            Scanner sc= new Scanner(fis);
            while(sc.hasNextLine())
            {
                // Read the Input Data from File
                String[] inputs = sc.nextLine().split(" ");
                String input = inputs[0];
                Command command = Command.valueOf(input);
                switch (command){
                    case ALLOT_WATER:
                        int apartmentSize = Integer.parseInt(inputs[1]);
                        int[] ratios = ProjectUtilities.getNumbersFromRatio(inputs[2]);
                        waterManagementService.allocateWater(apartmentSize,ratios[0],ratios[1]);
                        break;
                    case ADD_GUESTS:
                        int noOfGuests = Integer.parseInt(inputs[1]);
                        waterManagementService.addGuests(noOfGuests);
                        break;
                    case BILL:
                        System.out.println(waterManagementService.bill());
                        break;
                    default:
                        break;
                }
            }
            sc.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}

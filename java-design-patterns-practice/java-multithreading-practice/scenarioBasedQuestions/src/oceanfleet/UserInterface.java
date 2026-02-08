package oceanfleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VesselUtil vesselUtil = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter vessel details");
        System.out.println("Format: vesselId:vesselName:averageSpeed:vesselType");
        System.out.println("Example: V001:Sea King:25.5:Cargo");

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] data = input.split(":");

            Vessel vessel = new Vessel(
                    data[0],
                    data[1],
                    Double.parseDouble(data[2]),
                    data[3]
            );

            vesselUtil.addVesselPerformance(vessel);
        }

        System.out.println("Enter the Vessel Id to check speed");
        System.out.println("Example: V001");
        String searchId = sc.nextLine();

        Vessel foundVessel = vesselUtil.getVesselById(searchId);

        if (foundVessel != null) {
            System.out.println(foundVessel.getVesselId() + " | "
                    + foundVessel.getVesselName() + " | "
                    + foundVessel.getVesselType() + " | "
                    + foundVessel.getAverageSpeed() + " knots");
        } else {
            System.out.println("Vessel Id " + searchId + " not found");
        }

        System.out.println("High performance vessels are");
        List<Vessel> highPerformanceList = vesselUtil.getHighPerformanceVessels();

        for (Vessel v : highPerformanceList) {
            System.out.println(v.getVesselId() + " | "
                    + v.getVesselName() + " | "
                    + v.getVesselType() + " | "
                    + v.getAverageSpeed() + " knots");
        }

        sc.close();
    }
}

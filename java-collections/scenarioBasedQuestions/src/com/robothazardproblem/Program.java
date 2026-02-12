import java.util.*;

class Program {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Arm precision ");
        double armprecesin = sc.nextDouble();

        System.out.println("Enter worker density ");
        double workerDensity = sc.nextDouble();

        System.out.println("Enter machine State: (Worn ,Faulty, Critical) ");
        String machineState = sc.next();

        RobotHazardAuditor a = new RobotHazardAuditor();

        try {
            System.out.println("Hazard Risk: " +
                a.calculateHazardRisk(armprecesin, workerDensity, machineState));
        }
        catch (RobotSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

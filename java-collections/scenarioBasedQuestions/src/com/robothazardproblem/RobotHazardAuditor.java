public class RobotHazardAuditor {

    public double calculateHazardRisk(double armPrecision,
                                      double workerDensity,
                                      String machineryState)
                                      throws RobotSafetyException {

        // Arm Precision Validation
        if (!(armPrecision >= 0.0 && armPrecision <= 1.0)) {
            throw new RobotSafetyException(
                "Error: Arm precision must be between 0.0 and 1.0");
        }

        // Worker Density Validation
        if (!(workerDensity >= 1 && workerDensity <= 20)) {
            throw new RobotSafetyException(
                "Error: Worker density must be between 1 and 20");
        }

        // Machinery State Validation
        if (!machineryState.equalsIgnoreCase("Worn") &&
            !machineryState.equalsIgnoreCase("Critical") &&
            !machineryState.equalsIgnoreCase("Faulty")) {

            throw new RobotSafetyException(
                "Error: Unsupported machinery state");
        }

        double riskFactor = 0;

        switch (machineryState.toLowerCase()) {
            case "worn":
                riskFactor = 1.3;
                break;
            case "faulty":
                riskFactor = 2.0;
                break;
            case "critical":
                riskFactor = 3.0;
                break;
        }

        double hazardRisk =
                ((1.0 - armPrecision) * 15.0) +
                (workerDensity * riskFactor);

        return hazardRisk;
    }
}

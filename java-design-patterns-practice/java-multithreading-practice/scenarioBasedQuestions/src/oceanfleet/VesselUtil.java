package oceanfleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    // Getter and Setter
    public List<Vessel> getVesselList() {
        return vesselList;
    }

    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    // Requirement 1: Add vessel performance
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // Requirement 2: Get vessel by ID (case-sensitive)
    public Vessel getVesselById(String vesselId) {
        for (Vessel v : vesselList) {
            if (v.getVesselId().equals(vesselId)) {
                return v;
            }
        }
        return null;
    }

    // Requirement 3: Get high performance vessels
    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> result = new ArrayList<>();

        if (vesselList.isEmpty()) {
            return result;
        }

        double maxSpeed = vesselList.get(0).getAverageSpeed();

        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() > maxSpeed) {
                maxSpeed = v.getAverageSpeed();
            }
        }

        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() == maxSpeed) {
                result.add(v);
            }
        }

        return result;
    }
}

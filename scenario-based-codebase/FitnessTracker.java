
//13. Sandeep’s Fitness Challenge Tracker 
//Each day Sandeep completes a number of push-ups.
//● Store counts for a week.
//● Use for-each to calculate total and average.
//● Use continue to skip rest days.

public class FitnessTracker {

    public static void main(String[] args) {

        // Push-ups done by Sandeep for 7 days
        // 0 indicates a rest day
        int[] pushUps = {30, 40, 0, 50, 60, 0, 45};

        int totalPushUps = 0;
        int workoutDays = 0;

        // Using for-each loop to process daily push-ups
        for (int count : pushUps) {

            // Skip rest days
            if (count == 0) {
                continue;
            }

            totalPushUps += count;
            workoutDays++;
        }

        // Calculate average push-ups (only workout days)
        double average = (double) totalPushUps / workoutDays;

        // Display results
        System.out.println(" Sandeep’s Fitness Challenge Report");
        System.out.println("------------------------------------");
        System.out.println("Total Push-ups in a Week : " + totalPushUps);
        System.out.println("Workout Days            : " + workoutDays);
        System.out.println("Average Push-ups / Day  : " + average);
    }
}

class Workout implements ITrackable {

    protected String type;
    protected int duration;
    protected int caloriesBurned;

    private String[] workoutLog = new String[5];

    Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    void calculateCalories() {
        caloriesBurned = duration * 5;
    }

    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }

    int getCaloriesBurned() {
        return caloriesBurned;
    }
}

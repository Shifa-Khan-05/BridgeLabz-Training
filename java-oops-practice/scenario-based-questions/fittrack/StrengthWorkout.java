class StrengthWorkout extends Workout {

    StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    void calculateCalories() {
        caloriesBurned = duration * 6;
    }
}

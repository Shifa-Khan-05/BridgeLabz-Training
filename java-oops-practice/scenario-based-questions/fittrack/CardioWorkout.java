class CardioWorkout extends Workout {

    CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    void calculateCalories() {
        caloriesBurned = duration * 8;
    }
}

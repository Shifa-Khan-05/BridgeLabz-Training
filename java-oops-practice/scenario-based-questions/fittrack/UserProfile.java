class UserProfile {

    String name;
    int age;
    private double weight;
    String goal;
    int dailyTarget;

    UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = "Maintain Fitness";
        this.dailyTarget = 2000;
    }

    UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyTarget = 2500;
    }

    double getWeight() {
        return weight;
    }

    void showProfile() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Goal : " + goal);
        System.out.println("Daily Calorie Target : " + dailyTarget);
    }
}

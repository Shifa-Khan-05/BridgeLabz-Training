class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;
    private int energy;
    private int mood;

    Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 5;
        this.energy = 5;
        this.mood = 5;
    }

    public void feed() {
        hunger = hunger - 2;
        energy = energy + 1;
        mood = mood + 1;
        System.out.println(name + " is eating.");
    }

    public void play() {
        energy = energy - 2;
        hunger = hunger + 1;
        mood = mood + 2;
        System.out.println(name + " is playing.");
    }

    public void sleep() {
        energy = energy + 3;
        mood = mood + 1;
        System.out.println(name + " is sleeping.");
    }

    void showStatus() {
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood  : " + mood);
    }

    void makeSound() {
        System.out.println("Pet makes a sound");
    }
}

class Bird extends Pet {

    Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet Tweet");
    }
}

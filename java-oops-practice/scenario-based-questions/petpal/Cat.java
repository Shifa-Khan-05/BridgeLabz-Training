class Cat extends Pet {

    Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: meow meow");
    }
}

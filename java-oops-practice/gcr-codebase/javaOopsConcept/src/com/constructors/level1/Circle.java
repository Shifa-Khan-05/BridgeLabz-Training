package com.constructors.level1;
public class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
		Circle circle=new Circle();
		System.out.println(circle.area());
	}
}

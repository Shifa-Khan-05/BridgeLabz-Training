package com.lambdaexpression.basicsystemtasks;

import java.util.*;
import java.util.function.*;

public class BasicLambdaTasks {

    public static void main(String[] args) {

        // 1. Run task in separate thread
        Runnable task =
                () -> System.out.println("Background task running");
        new Thread(task).start();

        // 2. Print numbers from list
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        nums.forEach(n -> System.out.println(n));

        // 3. Check even or odd
        Predicate<Integer> evenOdd =
                n -> n % 2 == 0;
        System.out.println(evenOdd.test(4));

        // 4. Add two numbers
        BiFunction<Integer, Integer, Integer> add =
                (a, b) -> a + b;
        System.out.println(add.apply(10, 20));

        // 5. Find greater of two numbers
        BiFunction<Integer, Integer, Integer> greater =
                (a, b) -> a > b ? a : b;
        System.out.println(greater.apply(15, 10));
    }
}
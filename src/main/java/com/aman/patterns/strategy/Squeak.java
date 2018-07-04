package com.aman.patterns.strategy;

/**
 * Created by aman on 29/5/18.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("This one has loud pitch");
    }
}

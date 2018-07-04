package com.aman.patterns.strategy;

/**
 * Created by aman on 29/5/18.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Can only do quack quack quack");
    }
}

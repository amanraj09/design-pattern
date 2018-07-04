package com.aman.patterns.strategy;

/**
 * Created by aman on 29/5/18.
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Duck has wings and can fly");
    }
}

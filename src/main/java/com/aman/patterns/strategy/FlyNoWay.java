package com.aman.patterns.strategy;

/**
 * Created by aman on 29/5/18.
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("Poor unlucky cannot fly even I throw it from terrace of my building");
    }
}

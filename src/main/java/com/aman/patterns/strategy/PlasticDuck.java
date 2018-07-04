package com.aman.patterns.strategy;

/**
 * Created by aman on 29/5/18.
 */
public class PlasticDuck extends Duck {
    public PlasticDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}

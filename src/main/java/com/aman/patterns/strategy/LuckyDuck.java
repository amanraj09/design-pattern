package com.aman.patterns.strategy;

/**
 * Created by aman on 29/5/18.
 */
public class LuckyDuck extends Duck {
    public LuckyDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}

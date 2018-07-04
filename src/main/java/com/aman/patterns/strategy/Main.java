package com.aman.patterns.strategy;

/**
 * Created by aman on 29/5/18.
 */
public class Main {
    public static void main(String...args) {
        Duck model = new LuckyDuck();
        model.performFly();
        model.performQuack();

        model.setFlyBehavior(new FlyNoWay());
        model.setQuackBehavior(new Squeak());

        model.performFly();
        model.performQuack();
    }
}

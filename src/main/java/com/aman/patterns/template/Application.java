package com.aman.patterns.template;

/**
 * Created by aman on 26/6/18.
 */
public class Application {
    public static void main(String...args) {
        Algorithm algorithm = new ParseDocument();

        algorithm.execute();

        algorithm = new ParseDatabase();

        algorithm.execute();
    }
}

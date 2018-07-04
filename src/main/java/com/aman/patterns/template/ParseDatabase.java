package com.aman.patterns.template;

/**
 * Created by aman on 26/6/18.
 */
public class ParseDatabase extends Algorithm {
    void preExecute() {
        System.out.println("In Pre execute of Parse Database");
    }

    void doExecute() {
        System.out.println("In Do execute of Parse Database");
    }

    void postExecute() {
        System.out.println("In Post execute of Parse Database");
    }

    Object getResult() {
        return null;
    }
}

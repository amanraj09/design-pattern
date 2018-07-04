package com.aman.patterns.template;

/**
 * Created by aman on 26/6/18.
 */
public class ParseDocument extends Algorithm {
    void preExecute() {
        System.out.println("In Pre execute of Parse document");
    }

    void doExecute() {
        System.out.println("In do execute of Parse document");

    }

    void postExecute() {
        System.out.println("In Post execute of Parse document");
    }

    Object getResult() {
        return null;
    }
}

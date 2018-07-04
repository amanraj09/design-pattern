package com.aman.patterns.template;

/**
 * Created by aman on 26/6/18.
 */
public abstract class Algorithm {

    public Object execute() {
        this.preExecute();
        this.doExecute();
        this.postExecute();
        return this.getResult();
    }

    abstract void preExecute();
    abstract void doExecute();
    abstract void postExecute();
    abstract Object getResult();
}

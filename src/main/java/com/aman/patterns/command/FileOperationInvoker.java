package com.aman.patterns.command;

/**
 * Created by hasher on 5/7/18.
 */
public class FileOperationInvoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeOperation() {
        command.execute();
    }
}

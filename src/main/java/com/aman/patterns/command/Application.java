package com.aman.patterns.command;

/**
 * Created by aman on 5/7/18.
 */
public class Application {

    public static void main(String...args) {
        FileOperationInvoker fileOperationInvoker = new FileOperationInvoker();
        RecieverFile recieverFile = new RecieverFile();
        Command command = new FileOpen(recieverFile);
        fileOperationInvoker.setCommand(command);
        fileOperationInvoker.executeOperation();

        command = new FileSave(recieverFile);
        fileOperationInvoker.setCommand(command);
        fileOperationInvoker.executeOperation();

        command = new FileClose(recieverFile);
        fileOperationInvoker.setCommand(command);
        fileOperationInvoker.executeOperation();
    }
}

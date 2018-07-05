package com.aman.patterns.command;

/**
 * Created by aman on 5/7/18.
 */
public class FileClose implements Command {
    private RecieverFile recieverFile;

    public FileClose(RecieverFile recieverFile) {
        this.recieverFile = recieverFile;
    }

    public void execute() {
        recieverFile.close();
    }
}

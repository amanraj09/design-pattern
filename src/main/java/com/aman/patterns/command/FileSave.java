package com.aman.patterns.command;

/**
 * Created by aman on 5/7/18.
 */
public class FileSave implements Command {
    private RecieverFile recieverFile;

    public FileSave(RecieverFile recieverFile) {
        this.recieverFile = recieverFile;
    }

    public void execute() {
        recieverFile.save();
    }
}

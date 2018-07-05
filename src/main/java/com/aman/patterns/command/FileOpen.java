package com.aman.patterns.command;

import java.io.File;

/**
 * Created by aman on 5/7/18.
 */
public class FileOpen implements Command {
    private RecieverFile file;

    FileOpen(RecieverFile inputFile) {
        this.file = inputFile;
    }
    public void execute() {
        file.open();
    }
}

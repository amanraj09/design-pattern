package com.aman.patterns.command;

/**
 * Created by aman on 5/7/18.
 */
public class RecieverFile {

    void open() {
        System.out.println("File opened.");
    }

    void save() {
        System.out.println("File saved.");
    }

    void close() {
        System.out.println("File closed.");
    }
}

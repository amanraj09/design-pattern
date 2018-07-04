package com.aman.patterns.Factory;

/**
 * Created by hasher on 10/6/18.
 */
public class PDFDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}

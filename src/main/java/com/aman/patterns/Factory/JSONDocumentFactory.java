package com.aman.patterns.Factory;

/**
 * Created by aman on 10/6/18.
 */
public class JSONDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new JSONDocument();
    }
}

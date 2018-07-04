package com.aman.patterns.Factory;

/**
 * Created by aman on 10/6/18.
 */
public class Application {
    private Document document;

    public void parseDocument(DocumentFactory documentFactory) {
        Document document = documentFactory.createDocument();
        document.parse();
    }

    public static void main(String...args) {
        Application application = new Application();

        application.parseDocument(new XMLDocumentFactory());

        application.parseDocument(new JSONDocumentFactory());

        application.parseDocument(new PDFDocumentFactory());
    }
}

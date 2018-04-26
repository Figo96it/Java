package com.company.factory;

public class DocumentGenerator {
    public Document createDocument(String textToSave, Document.DocumentType type){

        Document document;

        switch (type){
            case TXT:
                document=new TxtDocument(textToSave);
                break;
            case HTML:
                document=new HtmlDocument(textToSave);
                break;
            default:
                document=null;
        }


        return document;
    }
}

package com.company.factory;

public class TxtDocument extends Document {
    public TxtDocument(String textToSave) {
        super(textToSave, DocumentType.TXT);
    }
}

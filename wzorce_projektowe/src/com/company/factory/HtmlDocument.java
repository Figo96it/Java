package com.company.factory;

public class HtmlDocument extends Document {
    public HtmlDocument(String textToSave) {
        super(formatText(textToSave), DocumentType.HTML);
    }

    private static String formatText(String text){
        return String.format("<h1>%s</h1>",
                text.replaceAll("\r\n","<br>"));
    }
}

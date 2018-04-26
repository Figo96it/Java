package com.company.factory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;

public class Document {
    private String textToSave;
    private DocumentType type;

    public Document(String textToSave, DocumentType type){
        this.textToSave = textToSave;
        this.type=type;

        Calendar calendar=new Calendar.Builder()
                .setTimeOfDay(10,12,0)
                .build();

        Locale a=new Locale.Builder()
                .setLanguage("pl")
                .build();
    }

    public String getTextToSave(){
        return textToSave;
    }

    public void saveFile(String fileName) {
        String path="C:\\Users\\MSI\\Documents\\Moje palety\\wzorce_projektowe";

        String outputPath=String.format("%s\\%s.%s",
                path, fileName, type.getExtension()
                );
        System.out.println("Plik zostanie zapisany w :\n"+outputPath);

        try {
            File file = new File(outputPath);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(textToSave);
            fileWriter.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public enum DocumentType{
        TXT("txt"), XML("xml"), HTML("html");

        private String extension;
        DocumentType(String extension){
            this.extension=extension;
        }

        public String getExtension(){
            return extension;
        }
    }

}

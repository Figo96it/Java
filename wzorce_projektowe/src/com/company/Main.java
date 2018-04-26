package com.company;

import com.company.builder.User;
import com.company.facade.Facade;
import com.company.factory.Document;
import com.company.factory.DocumentGenerator;
import com.company.observer.Person;
import com.company.observer.Weather;
import com.company.singleton.DataBase;
import com.company.strategy.Calculator;
import com.company.strategy.OperationAdd;
import com.company.strategy.OperationSubtraction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        facade();
//        observer();
//        singleton();
//        builder();
//        factory();
        strategy();
    }

    private static void strategy() {
        Calculator calculator=new Calculator();

        calculator.setStrategy(new OperationAdd());
        System.out.println("10+5="+calculator.calculate(10,5));

        calculator.setStrategy(new OperationSubtraction());
        System.out.println("10-5="+calculator.calculate(10,5));

        System.out.println();
    }

    private static void factory(){
        DocumentGenerator generator=new DocumentGenerator();
        String myText="Ala ma kota.\r\nDziś pada śnieg.\r\nJutro mamy niedziele.";

        Document txt=generator.createDocument(myText, Document.DocumentType.TXT);
        txt.saveFile("moj_txt");

        Document html=generator.createDocument(myText, Document.DocumentType.HTML);
        html.saveFile("moj_html");
    }

    private static void builder(){
        User u1= new User.UserBuilder()
                .age(10)
                .build();

        System.out.println(u1);
    }


    private static void singleton(){
//        String a=new String("Lódź");
//        String b=new String("Lódź");
//        Person p1=new Person("AAA", 10);
//        Person p2=new Person("AAA", 10);

        DataBase db1=DataBase.getInstance();
        DataBase db2=DataBase.getInstance();

        db1.add("Maciej","Kuba","Kasia","Adam");
        db2.showAll();
    }

    private static void facade() {
        Facade system=new Facade();
        system.activate();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        system.deactivate();
    }

    private static void observer(){
        Person p1=new Person("Damian",25);
        Person p2=new Person("Dariusz",15);
        Person p3=new Person("Patryk",22);
        Person p4=new Person("Lidia",34);

        Weather weather=new Weather();
        weather.addObserver(p1,p2,p3,p4);

        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("\nPodaj temperature: ");
            int currentTemp=scanner.nextInt();
            weather.updateTemp(currentTemp);
        }

    }
}

package com.company.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weather {

    private List<Person> observers=new ArrayList<>();
    private int currentTemp;

    public void addObserver(Person... people){
        observers.addAll(Arrays.asList(people));
    }

    public void updateTemp(int currentTemp){
        this.currentTemp=currentTemp;
        notifyObserve();
    }

    public void notifyObserve() {
        for(Person person : observers){
            if(currentTemp>person.getMaxTemp()){
                person.notify(currentTemp);
            }
        }
    }


}

package com.company.observer;

public class Person {

    private String name;
    private int maxTemp;

    public Person(String name, int maxTemp) {
        this.name = name;
        this.maxTemp = maxTemp;
    }

    public String getName() {
        return name;
    }

    public int getMaxTemp() {
        return maxTemp;
    }


    void notify(int currentTemp) {
        if(currentTemp>maxTemp){
            System.out.printf(
                    "%s twierdzi, że temperatura %s C to za gorąco! Dla mnie max to %s \n",
                    name,currentTemp,maxTemp
            );
        }
    }
}

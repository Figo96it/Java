package com.company.strategy;

public class Calculator {

    private Strategy strategy;

    public Calculator(){

    }

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }

    public int calculate(int numberOne,int numberTwo){
        return strategy.doOperation(numberOne,numberTwo);

    }
}

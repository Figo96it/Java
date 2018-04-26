package com.company.strategy;

public class OperationAdd implements Strategy{

    public int doOperation(int numberOne, int numberTwo){
        return numberOne+numberTwo;
    }
}

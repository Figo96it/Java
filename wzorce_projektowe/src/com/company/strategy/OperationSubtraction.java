package com.company.strategy;

public class OperationSubtraction implements Strategy {

    @Override
    public int doOperation(int numberOne, int numberTwo) {
        return numberOne-numberTwo;
    }
}

package operations;

import interfaces.MathOperation;

public class Addition implements MathOperation {
    @Override
    public double execute(double num1, double num2) {
        return num1 + num2;
    }
}



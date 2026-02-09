package operations;

import interfaces.MathOperation;

public class Power implements MathOperation {
    @Override
    public double execute(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}

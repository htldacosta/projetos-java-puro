package interfaces;

import exceptions.CalculationException;

public interface MathOperation {
    double execute(double num1, double num2) throws CalculationException;
}

package operations;

import exceptions.CalculationException;
import interfaces.MathOperation;

public class Division implements MathOperation {
    @Override
    public double execute(double num1, double num2) {
        if (num2 == 0) {
            throw new CalculationException("Erro: Divisão por zero não é permitida!");
        }
        return num1 / num2;
    }
}

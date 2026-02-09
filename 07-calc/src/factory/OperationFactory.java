package factory;

import enums.Operator;
import exceptions.CalculationException;
import interfaces.MathOperation;
import operations.*;

public class OperationFactory {

    public MathOperation createOperation(Operator operator) {
        if (operator == null) {
            throw new CalculationException("Operator inválido ou não suportado.");
        }

        return switch (operator) {
            case SUM -> new Addition();
            case SUB -> new Subtraction();
            case MULT -> new Multiplication();
            case DIV -> new Division();
            case POW -> new Power();
            default -> throw new CalculationException("Operação não implementada.");
        };
    }
}

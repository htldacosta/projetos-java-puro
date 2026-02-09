import enums.Operator;
import exceptions.CalculationException;
import factory.OperationFactory;
import interfaces.MathOperation;
import ui.InputHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler();
        OperationFactory operationFactory = new OperationFactory();

        System.out.println(" === CALCULADORA SOLID JAVA ===");
        System.out.println("Operadores disponíveis: + - * / ^");
        System.out.println("Digite 'sair' no operador para encerrar.");
        System.out.println("==================================\n");


        boolean running = true;

        while (running) {
            try {
                double num1 = inputHandler.getDouble("Digite o 1 número: ");

                String symbol = inputHandler.getOperator("Digite a operação (+ - * / ^):");

                if (symbol.equalsIgnoreCase("sair")) {
                    running = false;
                    continue;
                }

                Operator operatorEnum = Operator.fromSymbol(symbol);
                MathOperation strategy = operationFactory.createOperation(operatorEnum);

                double num2 = inputHandler.getDouble("Digite o 2 número: ");

                double result = strategy.execute(num1, num2);

                System.out.println("Resultador: " + String.format("$.2f", result));
                System.out.println("--------------------------------------------");

            } catch (CalculationException e) {
                System.out.println("Erro de Negócio: " + e.getMessage());
            }catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        System.out.println("Calculadora encerrada. Até logo!");
        inputHandler.close();
    }
}
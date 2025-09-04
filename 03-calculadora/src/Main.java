import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        //Numero res = new Numero();



        System.out.println("Digite o primeiro numero: ");
        n1.setValor(scanner.nextInt());

        System.out.println("Digite o segundo numero: ");
        n2.setValor(scanner.nextInt());


        System.out.println("Digite um dos operadores disponivel: + | - | * | / | :");
        char sinal = scanner.next().charAt(0);

        while(sinal != '+' && sinal != '-' && sinal != '*' && sinal != '/' ) {

            System.out.println("digite um operador valido!");

            System.out.println("o operador: '" + sinal + "' e invalido!");

            System.out.println("escolha um dos operadores disponiveis: + | - | * | / | :");
            sinal = scanner.next().charAt(0);

        }

        int res;

        if (sinal == '+'){
            res = Somar(n1.getValor(), n2.getValor());
            System.out.printf("O resultado da soma entre %d e %d é: %d", n1.getValor(), n2.getValor(), res);
        }
        else if (sinal == '-'){
             res = n1.getValor() - n2.getValor();
            System.out.printf("O resultado da subtração entre %d e %d é: %d", n1.getValor(), n2.getValor(), res);
        }
        else if (sinal == '*'){
             res = n1.getValor() * n2.getValor();
            System.out.printf("O resultado da multiplicação entre %d e %d é: %d", n1.getValor(), n2.getValor(), res);
        }
        else if (sinal == '/'){
             res = n1.getValor() / n2.getValor();
            System.out.printf("O resultado da divisão entre %d e %d é: %d", n1.getValor(), n2.getValor(), res);
        }
        else {
            System.out.println("Algo deu errado!!!");
        }


        scanner.close();

    }

    public static int Somar(int valor1, int valor2) {
        int res = valor1 + valor2;
        return res;
    }

    public static int Subtracao(int valor1, int valor2) {
        int res = valor1 - valor2;
        return res;
    }

    public static int Multiplicacao(int valor1, int valor2) {
        int res = valor1 - valor2;
        return res;
    }

    public static int Divisao(int valor1, int valor2) {
        int res = valor1 - valor2;
        return res;
    }
}
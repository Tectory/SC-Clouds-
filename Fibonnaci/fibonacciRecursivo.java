import java.util.*;

public class fibonacciRecursivo {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Integer posicaoFibonnaci;

        do {
            System.out.println("Digite um um numero inteiro positivo maior que 0: ");
            while (!scanner.hasNextInt()) {

                System.out.println("Este não é um numero valido");
                scanner.next();
            }

            posicaoFibonnaci = scanner.nextInt();

        } while (posicaoFibonnaci < 0);

        System.out.println("O valor da " + posicaoFibonnaci + " Fibonacci é: ");

        System.out.println(Fib(posicaoFibonnaci));

    }

    public static int Fib(int posicaoFibonnaci) {
        if (posicaoFibonnaci == 0) {
            return 0;
        } else if (posicaoFibonnaci == 1) {
            return 1;
        } else {
            return Fib(posicaoFibonnaci - 1) + Fib(posicaoFibonnaci - 2);

        }
    }
}
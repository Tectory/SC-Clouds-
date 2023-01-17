import java.io.*;
import java.util.*;

public class Fibonacci {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Integer posicaoFibonacci;

        do {
            System.out.println("Digite um um numero inteiro positivo maior que 0: ");
            while (!scanner.hasNextInt()) {

                System.out.println("Este não é um numero valido");
                scanner.next();
            }

            posicaoFibonacci = scanner.nextInt();

        } while (posicaoFibonacci < 0);

        System.out.println("O valor da posição " + posicaoFibonacci + " de Fibonacci é: ");

        Integer F0 = 0;
        Integer F1 = 1;
        Integer Fib = 0;

        if (posicaoFibonacci == 0) {
            System.out.println(0);
        } else if (posicaoFibonacci == 1) {
            System.out.println(1);
        }

        else {
            for (int i = 1; i < posicaoFibonacci; i++) {

                Fib = F0 + F1;
                F0 = F1;
                F1 = Fib;
            }

            System.out.println(Fib);
        }

    }
}
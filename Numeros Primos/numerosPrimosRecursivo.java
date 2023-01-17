import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class numerosPrimosRecursivo {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Integer nPrimo;
        do {
            System.out.println("Digite um um numero inteiro positivo maior que 1: ");
            while (!scanner.hasNextInt()) {

                System.out.println("Este não é um numero valido");
                scanner.next();
            }

            nPrimo = scanner.nextInt();

        } while (nPrimo < 2);

        System.out.println(" Lista de numeros primos até " + nPrimo + " :" + isPrimo(nPrimo));

    }

    public static ArrayList isPrimo(int nPrimo) {

        ArrayList<Integer> nPrimos = new ArrayList<Integer>();
        Integer contador;

        for (int i = 1; i <= nPrimo; i++) {

            contador = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0) {
                    contador = contador + 1;
                }
            }

            if (contador == 1) {
                nPrimos.add(i);
            }

        }
        return nPrimos;
    }
}
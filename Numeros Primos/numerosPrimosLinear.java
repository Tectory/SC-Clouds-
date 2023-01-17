import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class numerosPrimosLinear {
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

        ArrayList<Integer> nPrimos = new ArrayList<Integer>();
        ArrayList<Integer> n = new ArrayList<Integer>()
        Integer contador = 0;

        for (int i = 2; i <= nPrimo; i++) {

            n.add(i);
        }

        for (i = 0; i <= nPrimo - 1; i++){
            if

        }
        if (contador == 2) {
                nPrimos.add(i);
            }

        
        System.out.println(" Lista de numeros primos até " + nPrimo + " :" + nPrimos);
    }
}
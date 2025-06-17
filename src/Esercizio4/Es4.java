package Esercizio4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero");
        int num = scanner.nextInt();
        System.out.println("-- Conto alla rovescia: --");

        for (int i=num; i >= 0; i-- ) {
            System.out.println(i);
        }
        scanner.close();
    }
}

package Esercizio2;

import java.util.Scanner;

public class Es2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero tra 0 e 3: ");
        int num = scanner.nextInt();

      /*  switch (num) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore: Numero non compreso");

        }

       */

        switch (num) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Due");
            case 3 -> System.out.println("Tre");
            default -> System.out.println("Errore: Numero non compreso");
        }

        scanner.close();

    }
}

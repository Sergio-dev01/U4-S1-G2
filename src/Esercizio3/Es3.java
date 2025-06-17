package Esercizio3;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.print("Inserisci una stringa (':q' per uscire): ");
            input = scanner.nextLine();

            if (input.equals(":q")) {
                break;
            }

            System.out.println(String.join(",", input.split("")));
        }

        scanner.close();
    }
}
